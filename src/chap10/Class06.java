package chap10;

//由於名稱衝突CTriangle改成CTriangle06
class CTriangle06{
    protected int base;
    protected int height;

    protected void show(){
        System.out.println("base="+base+", height="+height);
    }
}
// (a)
//由於名稱衝突CData改成CData06
class CData06 extends CTriangle06{
    // (b)
    public void area(){
        show();
        System.out.println("area="+base*height/2);
    }
    // (c)
    CData06(int a, int b){
        base = a;
        height = b;
    }
}
public class Class06 {
    public static void main(String[] args) {
        // (c)
        CData06 obj = new CData06(3, 8);
        obj.area();
    }
}
