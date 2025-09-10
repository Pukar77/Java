package ThreadSynchronous;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount, String threadName) {
        System.out.println(threadName + " is trying to withdraw $" + amount);
        if (balance >= amount) {
            System.out.println(threadName + " is withdrawing $" + amount);
            balance -= amount;
            System.out.println(threadName + " completed. Remaining balance: $" + balance);
        } else {
            System.out.println(threadName + " cannot withdraw $" + amount + ". Insufficient balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private double amount;
    private String threadName;

    WithdrawTask(BankAccount account, double amount, String threadName) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        account.withdraw(amount, threadName);
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // initial balance

        // Unique withdrawal amounts that sum to 1000
        Thread t1 = new Thread(new WithdrawTask(account, 457, "Thread-1"));
        Thread t2 = new Thread(new WithdrawTask(account, 389, "Thread-2"));
        Thread t3 = new Thread(new WithdrawTask(account, 154, "Thread-3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
