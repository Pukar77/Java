package MultiThreading;
class MyThread1 extends Thread {
    public void run() {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("First Thread is running " + i);
        }
        try {
            Thread.sleep(500);

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i;
        for(i=0;i<5;i++){
            System.out.println("Second Thread is running "+i);
        }
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class Multi_Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
