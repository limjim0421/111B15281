package chap15;

class CData extends Thread{
    // (a)
    // 屬於類別的共用變數。而且 sub 方法是 static 的，所以當三個執行緒同時呼叫 sub 方法時
    // 它們會共享同一份 sum 變數，可能導致競爭條件（Race Condition）
    //private static int sum=30;
    private int sum = 30; // 改用實例變數
    private int n;
    private int sec;
    public CData(int a, int s){
        n=a;
        sec=s;
    }
    public void run(){
        while(sum>10){
            sub(n,sec);
        }
    }
    /*
    public static void sub(int a, int s){
        int tmp=sum-a;
        try {
            sleep(s);
        }catch (InterruptedException e){
        }
        if(tmp>0){
            sum=tmp;
            System.out.println("減"+a+"後，餘數為"+sum);
        }
    }*/
    // (b)
    // 由於三個執行緒共享同一份 sum 變數，所以在執行過程中，它們會同時進行 sub 方法的呼叫，可能導致競爭條件（Race Condition）。
    // 修正後的程式碼使用 synchronized 來確保 sub 方法的原子性，避免了競爭條件的問題。
    public synchronized void sub(int a, int s) {
        int tmp = sum - a;
        try {
            sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tmp > 0) {
            sum = tmp;
            System.out.println("減" + a + "後，餘數為" + sum);
        }
    }
}
public class Ex13 {
    public static void main(String[] args) {
        CData d1=new CData(5, 1500);
        CData d2=new CData(9, 1000);
        CData d3=new CData(8, 2000);
        d1.start();
        d2.start();
        d3.start();
    }
}
