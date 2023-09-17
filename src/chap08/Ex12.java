package chap08;

class CWin{
    int width;
    int height;
    String name;
    //(a)
    void setW(int w){
        this.width = w;
    }
    void setH(int h){
        this.height = h;
    }
    void setName(String s){
        this.name = s;
    }
    public void show(){
        System.out.println("Name="+name);
        System.out.println("W="+width+", H="+height);
    }
    //(b)
    void setWindows(int w, int h){
        this.width = w;
        this.height = h;
    }
    //(c)
    void setWindows(int w, int h, String s){
        this.width = w;
        this.height = h;
        this.name = s;
    }
}
public class Ex12 {
    public static void main(String[] args) {
        CWin cw = new CWin();
        cw.setName("My Windows");
        //(a)
        cw.setW(5);
        cw.setH(3);
        cw.show();
        //(b)
        cw.setWindows(3, 5);
        cw.show();
        //(c)
        cw.setWindows(1, 1, "My Win11");
        cw.show();
    }
}
