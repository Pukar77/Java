package ThreadSynchronous;

class Account {
    private double balanceAmount;
    Account(double initialAmount) {
        this.balanceAmount = initialAmount;
    }
    public synchronized void addFunds(double amount, String actorName) {
        System.out.println(actorName + " depositing $" + amount);
        balanceAmount += amount;
        System.out.println(actorName + " finished deposit. Current balance: $" + balanceAmount);
    }
    public synchronized void takeFunds(double amount, String actorName) {
        System.out.println(actorName + " trying to withdraw $" + amount);
        if (balanceAmount >= amount) {
            balanceAmount -= amount;
            System.out.println(actorName + " finished withdrawal. Current balance: $" + balanceAmount);
        } else {
            System.out.println(actorName + " cannot withdraw $" + amount + ". Insufficient balance: $" + balanceAmount);
        }  }
    public double getBalanceAmount() {
        return balanceAmount;
    }}
class AddMoneyTask implements Runnable {
    private Account account;
    private double amount;
    private String actorName;
    AddMoneyTask(Account account, double amount, String actorName) {
        this.account = account;
        this.amount = amount;
        this.actorName = actorName;
    }
    @Override
    public void run() {
        account.addFunds(amount, actorName);
    }}
class WithdrawMoneyTask implements Runnable {
    private Account account;
    private double amount;
    private String actorName;
    WithdrawMoneyTask(Account account, double amount, String actorName) {
        this.account = account;
        this.amount = amount;
        this.actorName = actorName;
    }
    @Override
    public void run() {
        account.takeFunds(amount, actorName);
    }}
public class BankThread {
    public static void main(String[] args) {
        Account myAccount = new Account(1200);
        Thread depositor1 = new Thread(new AddMoneyTask(myAccount, 700, "Depositor1"));
        Thread withdrawer1 = new Thread(new WithdrawMoneyTask(myAccount, 1200, "Withdrawer1"));
        Thread depositor2 = new Thread(new AddMoneyTask(myAccount, 145, "Depositor2"));
        Thread withdrawer2 = new Thread(new WithdrawMoneyTask(myAccount, 500, "Withdrawer2"));
        depositor1.start();
        withdrawer1.start();
        depositor2.start();
        withdrawer2.start();
    }}

