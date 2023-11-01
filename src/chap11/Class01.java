package chap11;

abstract class Caaa{
    protected int num;
    // (a)
    Caaa(int n){
        this.num = n;
    }
    public abstract void show();
}
class Cbbb extends Caaa{
    Cbbb(int n) {
        super(n);
        num = n;
    }
    @Override
    public void show() {
        System.out.println(num);
    }
}
public class Class01 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2);
        bb.show();
    }
}
