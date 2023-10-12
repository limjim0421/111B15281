package chap09;

// 為避免衝突Circle改為CCircle
class CCircle{
    private static double pi=3.14;
    private double radius;

    public CCircle(double r){       // Circle建構子
        radius=r;
    }
    public void show(){
        System.out.printf("area=%6.2f\n",pi*radius*radius);
    }
}
public class Class16 {
    public static void main(String[] args){
        // 為避免衝突Circle改為CCircle
        CCircle[] cir;
        cir=new CCircle[6];
        for(int i = 0; i<cir.length; i++) {
            cir[i]=new CCircle(i);
            cir[i].show();
        }
        cir[0]=new CCircle(1.0);
        cir[1]=new CCircle(4.0);
        cir[2]=new CCircle(2.0);

        cir[0].show();   // 利用物件cir[0]呼叫show() 函數
        cir[1].show();   // 利用物件cir[1]呼叫show() 函數
        cir[2].show();   // 利用物件cir[2]呼叫show() 函數
    }
}
