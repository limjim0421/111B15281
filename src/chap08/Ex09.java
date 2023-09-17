package chap08;

class CCalculator{
    int a;
    int b;
    int c;
    //(a)
    void set_value(int x, int y, int z){
        this.a = x;
        this.b = y;
        this.c = z;
    }
    //(b)
    void show(){
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
        System.out.println("c = " + this.c);
        System.out.println("add() = " + add(this.a, this.b, this.c));
        System.out.println("sub() = " + sub(this.a, this.b, this.c));
        System.out.println("mul() = " + mul(this.a, this.b, this.c));
        System.out.println("avg() = " + avg(this.a, this.b, this.c));
    }
    //(c)
    int add(int x, int y, int z){
        return x + y + z;
    }
    //(d)
    int sub(int x, int y, int z){
        return x - y - z;
    }
    //(e)
    int mul(int x, int y, int z){
        return x * y * z;
    }
    //(f)
    double avg(int x, int y, int z){
        return (x + y + z) / 3f;
    }
}
public class Ex09 {
    public static void main(String[] args) {
        CCalculator obj = new CCalculator();
        //(a)
        obj.set_value(25, 3, 7);
        //(b)
        obj.show();
    }
}
