package midterm;

class shape{
    int price = 3000;
    public double area(double r){
        return price * r * r * 3.14159;
    }
    public double area(double x, double y){
        return price * x * y;
    }
}
public class J04 {
    public static void main(String[] args){
        shape obj = new shape();
        double x = 5.1;
        System.out.println("radius of circle=" + x);
        System.out.println("Price of Circle area=" + obj.area(x));
        double y = 7.2;
        System.out.println("length=" + x + " width=" + y);
        System.out.println("Price of Rec. area=" + obj.area(x, y));
    }
}

