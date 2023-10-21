package chap10;

class Car{
    protected String owner;
    protected String id;

    final void show(){
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
    }
    // (a)
    public void CRectangle(String own, String s){
        this.owner = own;
        this.id = s;
    }
}
// (b)
class CColor extends Car{
    String color;
    // (c)
    CColor(String own, String s, String color){
        super();
        this.owner = own;
        this.id = s;
        this.color = color;
    }

    // (d)
    //因為父類別的show() 是final所以不能修改 故先使用父類別的show再加入新功能
    // (e)
    //因為final不能被改寫 所以只能把CColor 裡面的show 改名子
    public void sshow(){
        super.show();
        System.out.println("車深顏色:"+color);
    }
}
public class Class17 {
    public static void main(String[] args) {
        CColor myCar=new CColor("Riaan", "A1-2345", "Black");
        // (e)
        //因為final不能被改寫 所以只能把CColor 裡面的show 改名子
        myCar.sshow();
    }
}
