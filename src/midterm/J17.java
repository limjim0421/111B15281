package midterm;

interface iShape03
{
    public void show();
    public int area();
}
interface iColor
{
    public void showColor();
}
class CWin implements iShape03, iColor{
    protected int width;
    protected int height;
    protected String color;
    public CWin(int w, int h, String str){
        this.width = w;
        this.height = h;
        this.color = str;
    }

    @Override
    public void show() {
        showColor();
        System.out.println("width=" + width);
        System.out.println("height=" + height);
        System.out.println("area=" + area());
    }

    @Override
    public int area() {
        return width * height;
    }

    @Override
    public void showColor() {
        System.out.println("color=" + color);
    }
}
public class J17 {
    public static void main(String[] args){
        CWin win = new CWin(5, 7, "Green");
        win.show();
    }
}
