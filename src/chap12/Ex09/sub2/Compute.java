package chap12.Ex09.sub2;

import chap12.Ex09.sub1.MyMath;

public class Compute extends MyMath {
    public int ans;

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

    public void show(){
        System.out.println("ans="+ans);
    }
}
