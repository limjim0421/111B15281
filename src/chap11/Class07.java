package chap11;

interface MyMath07{
    void show();
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
}
interface AdvancedMath07{
    public void mod(int a, int b);
    public void fac(int a);
    public void pow(int a, int b);
}
class Compute07 implements MyMath07, AdvancedMath07{
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

    @Override
    public void mod(int a, int b) {
        ans = a % b;
    }

    @Override
    public void fac(int a) {
        if(a == 0){
            ans = 0;
        }else{
            ans = 1;
        }
        for(int i=1;i <= a;i++){
            ans *= i;
        }
    }

    @Override
    public void pow(int a, int b) {
        ans = (int)Math.pow(a, b);
    }
}
public class Class07 {
    public static void main(String[] args) {
        Compute07 cp = new Compute07();
        cp.mul(3, 5);
        cp.show();
        cp.mod(14, 5);
        cp.show();
        cp.fac(5);
        cp.show();
    }
}
