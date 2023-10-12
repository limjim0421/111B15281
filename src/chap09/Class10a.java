package chap09;
// 為避免衝突CRational改為CRational1
class CRational1 {
    public int n;
    public int d;
    public void setN(int num) {
        n=num;
    }
    public void setD(int num) {
        d=num;
    }
    public void show() {
        System.out.println(n+"/"+d); // 顯示分數
    }
    public void setND(int num, int den) {
        n=num;
        d=den;
    }
}

public class Class10a {

    public static void main(String[] args) {
        // 為避免衝突CRational改為CRational1
        CRational1 aaa=new CRational1();
        aaa.setN(2);
        aaa.setD(5);
        aaa.show();
        aaa.setND(6, 4);
        aaa.show();
    }
}
