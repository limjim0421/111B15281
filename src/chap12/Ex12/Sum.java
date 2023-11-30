package chap12.Ex12;

public class Sum{
    private int sum=0;
    public int add(int n){
        for(int i=1;i<=n;i++)
            sum+=i;
        return sum;
    }
}