package chap09;
class CRectangle{
    int width;
    int height;
    // (a)
    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }
    // (b)
    void CRectangle() {
        width = 10;
        height = 8;
    }
    // (c)
    public CRectangle() {
        this(10, 8);
    }
}

public class Class01 {
    public static void main(String[] args) {
        // (a)
        CRectangle cr = new CRectangle(5, 4);
        System.out.println(cr.width);
        System.out.println(cr.height);
        // (b)
        cr.CRectangle();
        System.out.println(cr.width);
        System.out.println(cr.height);
        // (c)
        cr.CRectangle();
        System.out.println(cr.width);
        System.out.println(cr.height);
    }
}
