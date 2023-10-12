package chap09;

public class Class06 {

    static int add2n(int n){
        int ans = 0;
        for(int i=0;i<=n;i++){
            ans += i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(add2n(5));
        System.out.println(add2n(10));
    }
}
