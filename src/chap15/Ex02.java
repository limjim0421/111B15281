package chap15;

// (a)
class Test02 extends Thread{
    String id;
    Test02(String str){
        this.id = str;
    }
    // (b)
    public void run(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<100000000;j++){
                System.out.println(id +" "+i);
            }
        }
    }
}
public class Ex02{
    public static void main(String[] args){
        // (c)
        Test02 hi = new Test02("Hello");
        Test02 bye = new Test02("Good bye");
        hi.run();
        bye.run();
        // (d)
        System.out.println("輸出全是Hello 1");
    }
}
