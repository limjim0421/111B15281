package chap10;

//由於名稱衝突CShape改成CShape11
class CShape11{
    public double area(){
        return 0.0;
    }
}
// (a)
//由於名稱衝突CCircle改成CCircle11
class CCircle11 extends CShape11{
    int r;
    public CCircle11(int r){
        this.r = r;
    }
    @Override
    public double area() {
        return r*r*Math.PI;
    }
}
// (b)
//由於名稱衝突CSquare改成CSquare11
class CSquare11 extends CShape11{
    int l;
    public CSquare11(int l){
        this.l = l;
    }
    @Override
    public double area() {
        return l*l;
    }
}
// (c)
//由於名稱衝突CTriangle改成CTriangle11
class CTriangle11 extends CShape11{
    int b;
    int h;
    public CTriangle11(int b, int h){
        this.b = b;
        this.h = h;
    }
    @Override
    public double area() {
        return b*h/2;
    }
}
public class Class11 {
    static double nums[] = new double[10];
    static int t = 0;
    static double ans = 0.0;
    // (e)
    public static void largest(double n){
        nums[t++] = n;
    }
    public static void largest(){
        for(double i : nums){
            if(i > ans){
                ans = i;
            }
        }
        System.out.println("largest="+ans);
    }
    public static void main(String[] args) {
        // (d)
        CCircle11 c1 = new CCircle11(3);
        System.out.println(c1.area());
        largest(c1.area());
        CCircle11 c2 = new CCircle11(9);
        System.out.println(c2.area());
        largest(c2.area());
        CSquare11 s1 = new CSquare11(4);
        System.out.println(s1.area());
        largest(s1.area());
        CSquare11 s2 = new CSquare11(8);
        System.out.println(s2.area());
        largest(s2.area());
        CTriangle11 t1 = new CTriangle11(6, 4);
        System.out.println(t1.area());
        largest(t1.area());
        CTriangle11 t2 = new CTriangle11(8, 9);
        System.out.println(t2.area());
        largest(t2.area());
        // (e)
        largest();
    }
}
