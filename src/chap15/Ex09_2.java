package chap15;

class Pig2 implements Runnable {
    private final Object lock;
    public Pig2(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            try {
                lock.wait(); // 等待main通知再開始執行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("小豬看到大野狼在爬煙囪");
        System.out.println("就在壁爐上煮了一鍋水");
        for (int i = 2; i <= 8; i += 2) {
            try {
                // sleep讓執行緒進入睡眠狀態，模擬執行緒每次執行後的等待時間
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%d分鐘 ", i);
        }
        try {
            // sleep讓執行緒進入睡眠狀態，模擬執行緒每次執行後的等待時間
            Thread.sleep(2000);
            System.out.println("10分鐘 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("一鍋滾燙的熱水煮好了");
    }
}

class Wolf2 implements Runnable {
    private final Object lock;

    public Wolf2(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        System.out.println("大野狼對著第三隻小豬的房子吹氣");
        System.out.println("牠不停地吹氣又吹氣");
        System.out.println("還是不能把房子吹倒");
        System.out.println("大野狼非常的生氣");
        System.out.println("牠決定要從煙囪爬進小豬的家裡");
        synchronized (lock) {
            lock.notify(); // 通知main可以開始執行Pig2
        }
        for (int i = 3; i <= 12; i += 3) {
            try {
                // sleep讓執行緒進入睡眠狀態，模擬執行緒每次執行後的等待時間
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%d分鐘 ", i);
        }
        try {
            // sleep讓執行緒進入睡眠狀態，模擬執行緒每次執行後的等待時間
            Thread.sleep(3000);
            System.out.println("15分鐘 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("大野狼爬上煙囪了");
        System.out.println("大野狼從煙囪滑進房子裡");
        System.out.println("就被小豬煮好的水燙死了");
    }
}

public class Ex09_2 {
    public static void main(String[] args) {
        Object lock = new Object();

        Pig2 Pig2 = new Pig2(lock);
        Wolf2 Wolf2 = new Wolf2(lock);

        Thread threadp = new Thread(Pig2);
        Thread threadw = new Thread(Wolf2);

        threadp.start();
        threadw.start();
    }
}
