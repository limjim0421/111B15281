package chap15;

class Test03 extends Thread{
    String id;
    Test03(String str){
        this.id = str;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<100000000;j++){
                System.out.println(id +" "+i);
            }
        }
    }
}
public class Ex03{
    public static void main(String[] args){
        Test03 hi = new Test03("Hello");
        Test03 bye = new Test03("Good bye");
        // (a) 不是用run而是用start
        hi.start();
        bye.start();
        // (b)
        Test03 morning = new Test03("Good morning");
        morning.start();
        // (c)
        Test03 night = new Test03("Good night");
        night.start();
        // System.out.println("輸出全是Hello 1");
    }
}
