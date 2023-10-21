package chap10;

//由於名稱衝突CShape改成CShape12
class CShape12{
    public double area(){
        return 0.0;
    }
}
// (a)
//由於名稱衝突CCircle改成CCircle12
class CCircle12 extends CShape12{
    int r;
    public CCircle12(int r){
        this.r = r;
    }
    @Override
    public double area() {
        return r*r*Math.PI;
    }
}
// (b)
//由於名稱衝突CSquare改成CSquare12
class CSquare12 extends CShape12{
    int l;
    public CSquare12(int l){
        this.l = l;
    }
    @Override
    public double area() {
        return l*l;
    }
}
// (c)
//由於名稱衝突CTriangle改成CTriangle12
class CTriangle12 extends CShape12{
    int b;
    int h;
    public CTriangle12(int b, int h){
        this.b = b;
        this.h = h;
    }
    @Override
    public double area() {
        return b*h/2;
    }
}
public class Class12 {
    //使用父類別的陣列變數來儲存子類別物件
    static CShape12 shapes[] = new CShape12[10];
    static int t = 0;
    static double ans = 0.0;
    // (e)
    public static void largest(double n){
        if (t < shapes.length) {
            //使用匿名內部類別來創建CSquare12的子類別物件
            shapes[t] = new CShape12() {
                @Override
                public double area() {
                    return n;
                }
            };
            t++;
        }
    }
    public static void largest(){
        for (int i = 0; i < t; i++) {
            if (shapes[i].area() > ans) {
                ans = shapes[i].area();
            }
        }
        System.out.println("largest=" + ans);
    }
    public static void main(String[] args) {
        // (d)
        CCircle12 c1 = new CCircle12(3);
        System.out.println(c1.area());
        largest(c1.area());
        CCircle12 c2 = new CCircle12(9);
        System.out.println(c2.area());
        largest(c2.area());
        CSquare12 s1 = new CSquare12(4);
        System.out.println(s1.area());
        largest(s1.area());
        CSquare12 s2 = new CSquare12(8);
        System.out.println(s2.area());
        largest(s2.area());
        CTriangle12 t1 = new CTriangle12(6, 4);
        System.out.println(t1.area());
        largest(t1.area());
        CTriangle12 t2 = new CTriangle12(8, 9);
        System.out.println(t2.area());
        largest(t2.area());
        // (e)
        largest();
    }
}
