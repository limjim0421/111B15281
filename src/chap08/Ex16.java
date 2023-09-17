package chap08;

class CSphere{
    private int x;
    private int y;
    private int z;
    private int radius;

    //(a)
    void setLocation(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //(b)
    void setRadius(int r){
        this.radius = r;
    }
    //(c)
    double surfaceArea(){
        return 4 * Math.PI * Math.sqrt(this.radius);
    }
    //(d)
    double volume(){
        return ((double)4/3) * Math.PI * Math.pow(this.radius , 3);
    }
    //(e)
    void showCenter(){
        System.out.printf("Center = (%d,%d,%d)\n", this.x, this.y, this.z);
    }
}
public class Ex16 {
    public static void main(String[] args) {
        CSphere csph = new CSphere();
        //(a)
        csph.setLocation(3, 4, 5);
        //(b)
        csph.setRadius(1);
        //(c)
        System.out.println("surfaceArea() = " + csph.surfaceArea());
        //(d)
        System.out.println("volume() = " + csph.volume());
        //(e)
        csph.showCenter();
    }
}
