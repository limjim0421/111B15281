package chap10;

//由於名稱衝突Caaa改成Caaa05
class Caaa05{
    private int num;

    public Caaa05(int n){
        num = n;
    }
    public int get(){
        return num;
    }
}
// 沒有使用super會使得無法付值給父類別
//由於名稱衝突Cbbb改成Cbbb05
class Cbbb05 extends Caaa05{
    // 使用super呼叫父類別建構元
    public Cbbb05(int n) {
        super(n);
    }
    public void show(){
        System.out.println("num="+get());
    }
}
public class Class05 {
    public static void main(String[] args) {
        // Cbbb05()改成Cbbb05(2)讓輸出為num=2
        Cbbb05 bb = new Cbbb05(2);
        bb.show();
    }
}
