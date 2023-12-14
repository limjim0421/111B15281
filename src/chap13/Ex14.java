package chap13;

class NotTriangle extends Exception { // (a)
}
class EquilateralTriangle extends Exception { // (c)
}
class NotEquilateralTriangle extends Exception { // (b)
}
public class Ex14 {
    public static void triangle(int a,int b, int c) throws NotTriangle, EquilateralTriangle, NotEquilateralTriangle {
        if((a+b)<c || (a+c)<c || (b+c)<a){
            // (a)
            System.out.println("不構成三角形");
        }else if(a==b && a==c && b==c){
            // (b)
            System.out.println("這是正三角形");
        }else{
            // (c)
            System.out.println("這不是正三角形");
        }
    }
    public static void main(String[] args) throws NotTriangle, NotEquilateralTriangle, EquilateralTriangle {
        int a=3, b=3, c=3;

        try {
            triangle(a, b, c);
        } catch (NotTriangle e) {
            // (a)
            throw new NotTriangle();
        } catch (NotEquilateralTriangle e) {
            // (b)
            throw new NotEquilateralTriangle();
        } catch (EquilateralTriangle e) {
            // (c)
            throw new EquilateralTriangle();
        }
    }
}
