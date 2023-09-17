package chap08;

class CTest{
    void test(int x){
        if(x == 0){
            System.out.println("此數為 0");
        }else if(x % 2 != 0){
            System.out.println("此數為奇數");
        }else{
            System.out.println("此數為偶數");
        }
    }
}
public class Ex07 {
    public static void main(String[] args) {
        CTest ctest = new CTest();
        ctest.test(3);
        ctest.test(8);
        ctest.test(0);
    }
}
