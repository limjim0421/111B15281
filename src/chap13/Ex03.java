package chap13;

public class Ex03{
    public static void main(String[] args){
        int num=12,den=0;
        try {
            int ans=num/den;
        } catch (ArithmeticException e) {
            System.out.println("除數為0");
        }finally{
            System.out.println("end of main()!!");
        }
    }
}
