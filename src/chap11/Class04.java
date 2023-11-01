package chap11;

interface MyMath04{
    public void show();
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
}
class Compute04 implements MyMath04{
    int ans = 0;
    @Override
    public void show() {
        System.out.println("ans="+ans);
    }

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
public class Class04 {
    public static void main(String[] args) {
        Compute04 cp = new Compute04();
        cp.mul(3, 5);
        cp.show();
    }
}
