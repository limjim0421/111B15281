package chap11;

abstract class MyMath02{
    protected int ans;
    public void show(){
        System.out.println("ans="+ans);
    }
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);

}
class Compute02 extends MyMath02{
    @Override
    public void add(int a, int b) {
        ans = a + b;
    }

    @Override
    public void sub(int a, int b) {
        ans = a - b;
    }

    @Override
    public void mul(int a, int b) {
        ans = a * b;
    }

    @Override
    public void div(int a, int b) {
        ans = a / b;
    }
}
public class Class02 {
    public static void main(String[] args) {
        Compute02 cp = new Compute02();
        cp.mul(3, 5);
        cp.show();
    }

}
