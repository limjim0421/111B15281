package chap15;
class MyClass07 implements Runnable{
    private String threadName;
    private int runCount;
    private long sleepTime;

    public MyClass07(String name, int count, long sleepTime) {
        this.threadName = name;
        this.runCount = count;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < runCount; i++) {
            System.out.println(threadName + " is running...");
            try {
                //sleep讓執行緒進入睡眠狀態，模擬執行緒每次執行後的等待時間
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Ex07 {
    public static void main(String[] args) {
        Runnable runnable1 = new MyClass07("Thread 1", 10, 1000);  // 1 second
        Runnable runnable2 = new MyClass07("Thread 2", 10, 2500);  // 2.5 seconds

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
    }
}
