package chap08;
class Cbbb{
    double x;
    double y;
}

public class Ex02 {
    public static void main(String[] args) {
        //(a)
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();
        //(b)
        obj1.x = 5.2;
        obj1.y = 3.9;
        //(c)
        obj2.x = 6.5;
        obj2.y = 4.6;
        //(d)
        avg.x = (obj1.x + obj2.x) / 2;
        //(e)
        avg.y = (obj1.y + obj2.y) / 2;
        //(f)

        System.out.printf("obj1.x = %s\n", obj1.x);
        System.out.printf("obj1.y = %s\n", obj1.y);
        System.out.printf("obj2.x = %s\n", obj2.x);
        System.out.printf("obj2.y = %s\n", obj2.y);
        System.out.printf("avg.x = %s\n", avg.x);
        System.out.printf("avg.y = %s", avg.y);
    }
}
