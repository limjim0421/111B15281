package chap12;

public class Ex19 {
    public static double sum = 0;
    public static void f(int n){
        if (n > 0){
            sum += Math.sqrt(n);
            f(n-1);
        }
    }
    public static void main(String[] args) {
        f(5);
        System.out.println(sum);
    }
}
