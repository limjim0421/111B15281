package chap10;

class Caaa09{
    private int num;

    public Caaa09(int n){
        num = n;
    }
    public int get(){
        return num;
    }
    // (a)
    public void display(){
        System.out.println("printed from Caaa class");
    }
}
// 沒有使用super會使得無法付值給父類別
//由於名稱衝突Cbbb改成Cbbb09
class Cbbb09 extends Caaa09{
    // 使用super呼叫父類別建構元
    public Cbbb09(int n) {
        super(n);
    }
    public void show(){
        System.out.println("num="+get());
    }
    // (b)
    public void display(){
        System.out.println("printed from Caaa class");
    }
}
public class Class09 {
    public static void main(String[] args) {
        // Cbbb09()改成Cbbb09(2)讓輸出為num=2
        Cbbb09 bb = new Cbbb09(2);
        bb.show();

        // (c)
        Caaa09 bb2 = new Cbbb09(9);
        bb2.display();
        System.out.println("輸出為printed from Caaa class");
        System.out.println("答案為父類別的display()");
    }
}
