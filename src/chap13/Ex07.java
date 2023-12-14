package chap13;

public class Ex07 {
    public static void main(String[] args){
        int[] arr={4, 12, 87, 21, 6, 18};
        int[] den={2, 0, 7, 0, 61, 0};
        double sum=0.0;
        int[] d={3, 0, 0, 1};
        for(int i=0;i<=6;i++){
            try {
                double ans = arr[i]/den[i];
                sum+=ans;
                System.out.println("sum="+sum);
            } catch (Exception e) {
                System.out.println("捕捉到例外了");
            }
        }
    }
}
