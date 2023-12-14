package chap13;

class Test{
    static void test(int num, int den) throws ArithmeticException{
        try{
            System.out.println(num+"/"+den+"="+num/den);
        }catch (ArithmeticException e){
            System.out.println("除數為0");
        }
    }
}
public class Ex10{
    public static void main(String[] args){
        Test obj = new Test();
        obj.test(12, 0);
    }
}
