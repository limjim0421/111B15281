package chap09;

public class Class18 {
    public static void main(String[] args) {
        CCircle cc = new CCircle(9);
        cc.show();
    }
    static class CCircle{
        public double pi = 3.14;
        public double radius;
        public CCircle(double r){
            radius = r;
        }
        void show(){
            System.out.println(radius * radius * pi);
        }
    }
}
