package chap10;

//由於名稱衝突Caaa改成Caaa01
class Caaa01{
        public int num1;
        public int num2;
}
//由於名稱衝突Cbbb改成Cbbb01
class Cbbb01 extends Caaa01{
    public void set_num(int a, int b){
        num1 = a;
        num2 = b;
    }
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }
}
public class Class01 {
    public static void main(String args[]){
        Cbbb01 bb = new Cbbb01();
        bb.set_num (5,10);
        bb.show();
    }
}
