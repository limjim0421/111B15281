package chap08;

class CCircle{
    double pi = 3.14;
    //(c)
    double radius;
    void show_periphery(){
        System.out.println("periphery="+2*pi*radius);
    }
    CCircle(){

    }
    //(c)
    CCircle(double radius){
        this.radius = radius;
    }
}
public class Ex06 {
    public static void main(String[] args) {
        //(a)
        CCircle cirl = new CCircle();
        //(b)
        cirl.radius = 3.0;
        //(c)
        cirl = new CCircle(3.0);
        //(d)
        cirl.show_periphery();
    }
}
