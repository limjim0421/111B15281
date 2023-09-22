package chap08;
class CBox{
    int length;
    int width;
    int height;

    //(b)
    public double volume(){
        double ans = length * width * height;
        return ans;
    }
    //(c)
    public double surfaceArea(){
        double ans = length * width * 6;
        return ans;
    }
    //(d)
    public void showData(){
        System.out.println("box.length= " + length);
        System.out.println("box.width= " + width);
        System.out.println("box.height= " + height);
    }
    //(e)
    public void showAll(){
        showData();
        System.out.println("box.volume= " + volume());
        System.out.println("box.surfaceArea= " + surfaceArea());
    }
}
public class Ex05 {
    public static void main(String[] args) {
        //(a)
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;

        box.showData();
        System.out.println("");
        box.showAll();
    }
}
