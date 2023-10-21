package chap10;

//由於名稱衝突CRectangle改成CRectangle19
class CRectangle19{
    protected int length;
    protected int width;
    // (a)
    CRectangle19(int l, int w){
        this.length = l;
        this.width = w;
    }

    // 當你傳遞一個對象給 println() 時，它會隱式調用該對象的 toString() 方法來獲取一個表示該對象的字符串。
    // 所以要改寫toString方法
    @Override
    public String toString() {
        int area = length * width;
        return "length=" + length + ", width=" + width + ", area=" + area;
    }
}
public class Class19 {
    public static void main(String[] args) {
        // (b)
        CRectangle19 rect = new CRectangle19(2, 6);
        System.out.println(rect);
    }
}
