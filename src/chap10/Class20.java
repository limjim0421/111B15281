package chap10;

//由於名稱衝突CRectangle改成CRectangle20
class CRectangle20{
    protected int length;
    protected int width;
    // (a)
    CRectangle20(int l, int w){
        this.length = l;
        this.width = w;
    }

    // 當你傳遞一個對象給 println() 時，它會隱式調用該對象的 toString() 方法來獲取一個表示該對象的字符串。
    // 所以要改寫toString方法
    // (a)
    @Override
    public String toString() {
        int area = length * width;
        return "length=" + length + ", width=" + width + ", area=" + area;
    }
    // (b)
    // (c)
    // 這種同時存在兩個版本的toString()方法的技術是方法的重載，是OOP中的一種技術
    // 允許在同一個類中創建具有相同名稱但不同參數的多個方法。
    public String toString(int a, int b) {
        if (a >= b) {
            return this.toString(); // 调用无参数的toString()方法
        } else {
            return "Argument Error";
        }
    }
}
public class Class20 {
    public static void main(String[] args) {
        // (b)
        CRectangle20 rect = new CRectangle20(2, 6);
        System.out.println(rect);

        System.out.println(rect.toString(1, 9));
        System.out.println(rect.toString(6, 4));
    }
}
