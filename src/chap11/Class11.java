package chap11;

interface Show_ans11{
    public void show();
}
interface MyMath11 extends Show_ans11{
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
}
class Compute11 implements MyMath11{
    int ans;
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
public class Class11 {
    public static void main(String[] args) {
        Compute11 cp=new Compute11();
        cp.mul(3, 5);
        cp.show();
    }
}
