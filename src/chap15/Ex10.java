package chap15;

class MyClass10 implements Runnable{
    String ThreadName;
    int runCount;
    int sleepTime;

    MyClass10(String str, int a, int b){
        this.ThreadName = str;
        this.runCount = a;
        this.sleepTime = b;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for(int i=1; i <= 5;i++){
            System.out.println(ThreadName + " " + i);
        }
    }
}
public class Ex10 {
    public static void main(String[] args) {
        Runnable hi = new MyClass10("Hello", 5, 1000);
        Runnable bye = new MyClass10("Good bye", 5, 2500);

        Thread thread1 = new Thread(hi);
        Thread thread2 = new Thread(bye);

        while (true) {
            Thread t1 = new Thread(hi);
            Thread t2 = new Thread(bye);

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
