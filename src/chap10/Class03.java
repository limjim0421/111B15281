package chap10;

//由於名稱衝突Caaa改成Caaa03
class Caaa03{
    public int num1;
    public int num2;
    // (a)
    public void Caaa03(){
        num1 = 1;
        num2 = 1;
    }
    // (b)
    public void Caaa03(int a, int b){
        num1 = a;
        num2 = b;
    }
}
//由於名稱衝突Cbbb改成Cbbb03
class Cbbb03 extends Caaa03{
    public void set_num(int a, int b){
        num1 = a;
        num2 = b;
    }
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }
    public Cbbb03(){

    }
    // (c)
    public Cbbb03(int a, int b){
        Caaa03(a, b);
    }
}
public class Class03 {
    public static void main(String[] args) {
        Cbbb03 bb = new Cbbb03();
        bb.set_num (5,10);
        bb.show();
        // (d)
        bb.Caaa03();
        bb.show();
        bb.Caaa03(3, 9);
        bb.show();
        Cbbb03 bb2 = new Cbbb03(6, 8);
        bb2.show();
    }
}
