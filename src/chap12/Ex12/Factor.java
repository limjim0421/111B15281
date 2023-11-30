package chap12.Ex12;

public class Factor {
    public int fac(int n) {
        if (n >= 1)
            return n * fac(n - 1);
        else return 1;
    }
}