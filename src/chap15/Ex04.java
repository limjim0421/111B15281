package chap15;

class Add implements Runnable{ //實作Runnable介面
    private int n;
    private int sum=0;
    public Add(int a){
        n=a;
    }
    public int n_num(){
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    @Override
    public void run() {
        n_num();
    }

    public int getSum() {
        return sum;
    }
}
public class Ex04 {
    public static void main(String[] args) {
        Add obj1 = new Add(5);
        Add obj2 = new Add(10);

        //建立Thread執行緒
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(obj1.getSum());
        System.out.println(obj2.getSum());
    }
}

