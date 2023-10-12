package chap09;

// (c)
// 最外面的 public class 的名子要跟檔案名一致 不能是Caaa要是Class03
class Caaa{
    // (d)
    // 否，在同一個 class 裡面的情況下(都在 class Caaa 裡面) private 跟 public 並不影響
    private int value;
    public Caaa(){
        // (a)
        this(10);
        System.out.println("value=" + value);
    }
    public Caaa(int i){
        value = i;
        System.out.println("value=" + value);
    }
}
public class Class03 {
    public static void main(String[] args) {
        // (b)
        // 21行呼叫 public Caaa()
        // 22行呼叫 public Caaa(int i)
        Caaa obj1 = new Caaa();
        // 呼叫 public Caaa(int i)
        Caaa obj2 = new Caaa(12);
    }
}