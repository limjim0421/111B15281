package chap11;

import java.text.DecimalFormat;

interface iVolume{
    public void showData();
    public double vol();
}
abstract class Sphere implements iVolume{
    final double PI = 3.14;
    protected int x;
    protected int y;
}
// (b)
// 因為Sphere類別是一個抽象類別，而抽象類別可以包含未實作的方法，但子類別必須提供這些方法的實作。
class Circle extends Sphere{
    int r;
    Circle(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.r = z;
    }
    @Override
    public void showData() {
        System.out.printf("球心：(%d,%d)\n", x, y);
        System.out.println("半徑："+r);
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("球體積："+ df.format(vol()));
    }

    @Override
    public double vol() {
        // (a)
        return Math.pow(r, 3)*4/3*PI;
    }
}
public class Class12 {
    public static void main(String[] args) {
        Circle cl = new Circle(8, 6, 2);
        cl.showData();
    }
}
