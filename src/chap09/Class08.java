package chap09;

// (a)
class CWin{
    // (f) 類別變數，因為要想在類別方法裡面使用就要宣告成類別變數，並且這樣子每個方法裡面的cnt才會是同一個cnt
    static int cnt = 0;
    String color;
    int width;
    int height;
    public CWin(){
        cnt++;
        // (c)
        color = "Red";
        width = 2;
        height = 2;
    }

    // (g) 類別函數，否則其他的class無法使用count()
    public static void count(){
        System.out.println("count: " + cnt);
    }
    // (b)
    public CWin(String str, int w, int h){
        cnt++;
        color = str;
        width = w;
        height = h;
    }

    // (d)
    public static void setZero(){
        cnt = 0;
    }
    // (e)
    public static void setValue(int n){
        cnt = n;
    }
}
public class Class08 {
    public static void main(String[] args) {
        CWin ct1 = new CWin();
        CWin ct2 = new CWin();
        CWin ct3 = new CWin("Blue", 6, 4);
        CWin.count();
        CWin.setZero();
        CWin.count();
        CWin.setValue(9);
        CWin.count();
    }
}
