package chap12;

public class Ex22 {
    public static double f(double a, double b){
        return Math.sin(Math.PI/a) + Math.cos(Math.PI/b);
    }
    public static void main(String[] args) {
        System.out.println(f(6, 3));
    }
}
