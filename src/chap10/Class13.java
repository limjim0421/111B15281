package chap10;

//由於名稱衝突Caaa改成Caaa13
class Caaa13{
    public int num1;
    public int num2;
    // (a)
    public void Caaa13(){
        num1 = 1;
        num2 = 1;
    }
    // (b)
    public void Caaa13(int a, int b){
        num1 = a;
        num2 = b;
    }
}
//由於名稱衝突Cbbb改成Cbbb13
class Cbbb13 extends Caaa13{
    public void set_num(int a, int b){
        num1 = a;
        num2 = b;
    }
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }

    //改寫原本的public Cbbb13()
    //透過呼叫父類別 Caaa13 的無引數建構函數來設定初值。
    public Cbbb13(){
        super();
    }
    // (c)
    public Cbbb13(int a, int b){
        Caaa13(a, b);
    }
}
public class Class13 {
    public static void main(String[] args) {
        Cbbb13 bb = new Cbbb13();
        bb.set_num (5,10);
        bb.show();
        // (d)
        bb.Caaa13();
        bb.show();
        bb.Caaa13(3, 9);
        bb.show();
        Cbbb13 bb2 = new Cbbb13(6, 8);
        bb2.show();
    }
}
