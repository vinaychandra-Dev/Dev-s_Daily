class table{
    void printTable(int n) {
        synchronized(this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
class MyThread1 extends Thread {
    Table t;
    MyThread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}
class MyThread3 extends Thread {
    Table t;
    MyThread3(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}
public class TestSynchronizedBlock {
    public static void main(String args[]) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread3 t2 = new MyThread3(obj);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
