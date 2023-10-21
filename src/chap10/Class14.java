package chap10;

//由於名稱衝突Caaa改成Caaa14
class Caaa14{
    public int num1;
    public int num2;

    // (a)
    public void Caaa14(){
        num1 = 1;
        num2 = 1;
    }
    // (b)
    public void Caaa14(int a, int b){
        num1 = a;
        num2 = b;
    }
}
//由於名稱衝突Cbbb改成Cbbb14
class Cbbb14 extends Caaa14{
    public void set_num(int a, int b){
        num1 = a;
        num2 = b;
    }
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }
    public Cbbb14(){

    }
    // (c)
    //修改原本的Caaa03(a, b);
    //使用 this.Caaa14(a, b); 來呼叫父類別 Caaa14 中的 Caaa14(int a, int b) 方法
    public Cbbb14(int a, int b){
        this.Caaa14(a, b);
    }
}
public class Class14 {
    public static void main(String[] args) {
        Cbbb14 bb = new Cbbb14();
        bb.set_num (5,10);
        bb.show();
        // (d)
        bb.Caaa14();
        bb.show();
        bb.Caaa14(3, 9);
        bb.show();
        Cbbb14 bb2 = new Cbbb14(6, 8);
        bb2.show();
    }
}
