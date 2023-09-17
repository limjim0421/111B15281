package chap08;
class CBox{
    int length;
    int width;
    int height;

    //(b)
    public double volume(double x, double y, double z){
        double ans = x * y * z;
        return ans;
    }
    //(c)
    public double surfaceArea(double x, double y){
        double ans = x * y * 6;
        return ans;
    }
    //(d)
    public void showData(int x, int y, int z){
        System.out.println("box.length= " + x);
        System.out.println("box.width= " + y);
        System.out.println("box.height= " + z);
    }
    //(e)
    public void showAll(int a, int b, int c, double d, double e){
        System.out.println("box.length= " + a);
        System.out.println("box.width= " + b);
        System.out.println("box.height= " + c);
        System.out.println("box.volume= " + d);
        System.out.println("box.surfaceArea= " + e);
    }
}
public class Ex05 {
    public static void main(String[] args) {
        //(a)
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;

        box.showData(box.length, box.width, box.height);
        System.out.println("");
        box.showAll(box.length, box.width, box.height,
                box.volume(box.length, box.width, box.height),
                box.surfaceArea(box.length, box.width));
    }
}
