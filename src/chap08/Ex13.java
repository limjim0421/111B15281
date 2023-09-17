package chap08;

class CCircle2{ //與Ex06的CCircle衝突故改名CCircle2
    double area(double r){
        return r*r*Math.PI;
    }
    float area(float r){
        return (float)(r*r*Math.PI);
    }
    double area(int r){
        return r*r*Math.PI;
    }
}
public class Ex13 {
    public static void main(String[] args) {
        CCircle2 cirl = new CCircle2();
        System.out.println(cirl.area(2));
        System.out.println(cirl.area(2.2f));
        System.out.println(cirl.area(2.2));
    }
}
