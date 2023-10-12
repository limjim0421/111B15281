package chap09;

public class Class07 {
    static int power(int x, int n){
        int ans = x;
        for(int i=1;i<n;i++){
            ans *= x;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(power(2, 5));
        System.out.println(power(3, 2));
    }
}
