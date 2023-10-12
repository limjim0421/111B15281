package chap09;

// (a)
class CCount{
    // (d) 類別變數，因為要想在類別方法裡面使用就要宣告成類別變數，並且這樣子每個方法裡面的cnt才會是同一個cnt
    static int cnt = 0;
    public CCount(){
        cnt++;
    }
    // (e) 類別函數，否則其他的class無法使用count()
    public static void count(){
        System.out.println("count: " + cnt);
    }
    // (b)
    public static void setZero(){
        cnt = 0;
    }
    // (c)
    public static void setValue(int n){
        cnt = n;
    }
}
public class Class05 {
    public static void main(String[] args) {
        CCount ct1 = new CCount();
        CCount ct2 = new CCount();
        CCount ct3 = new CCount();
        CCount.count();
        CCount.setZero();
        CCount.count();
        CCount.setValue(9);
        CCount.count();
    }
}
