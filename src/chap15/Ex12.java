package chap15;

import java.util.Random;
// (a)
class PrePaid extends Thread {
    int sum = 200;
    private void sleepForRandomTime() {
        try {
            // 模擬電話通話耗時的操作
            int sleepTime = (int) (Math.random() * 1000); // 0~999 毫秒
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // (b)
    @Override
    public void run() {
        Random random = new Random();
        int fee;
        while (sum > 10) {
            fee = random.nextInt(100);
            talk(fee);
        }
    }
    // (c)
    public void talk(int cost) {
        sum -= cost;
        sleepForRandomTime();
        System.out.println("打了" + cost + "元，餘額" + sum +"元");
    }
}

public class Ex12 {
    public static void main(String[] args) {
        PrePaid phone1=new PrePaid();
        PrePaid phone2=new PrePaid();
        PrePaid phone3=new PrePaid();
        phone1.start();
        phone2.start();
        phone3.start();
    }
}
