package case_study_1;

// (1)
class LCD_1{
    int inch_10 = 2000;
    int inch_15 = 2500;
    int inch_17 = 3000;
}
// (2)
class CPU_1 extends LCD_1{
    int speed_166 = 6000;
    int speed_220 = 8000;
    int speed_240 = 11000;
}
// (3)
class HD_1 extends CPU_1{
    int G_120 = 2400;
    int G_160 = 2800;
}
// (4)
    // (5)
class MiniNote_1 extends HD_1{
    int inch = inch_10;
    int speed = speed_166;
    int HD_1 = G_120;
    // (7)
    double cost;
    int price;
    double getCost(){
        cost = (inch + speed + HD_1) * 1.4;
        return cost;
    }
    int getPrice(){
        price = (inch + speed + HD_1) * 2;
        return price;
    }
    String name;
    String getName(){
        name = "MiniNote";
        return name;
    }

}
    // (6)
class Note15_1 extends HD_1{
    int inch = inch_15;
    int speed = speed_220;
    int HD_1 = G_160;
    // (7)
    double cost;
    int price;
    double getCost(){
        cost = (inch + speed + HD_1) * 1.4;
        return cost;
    }
    int getPrice(){
        price = (inch + speed + HD_1) * 2;
        return price;
    }
    String name;
    String getName(){
        name = "Note15";
        return name;
    }
}
public class JPD06_1 {
    public static void main(String[] args) {
        // (8)
        MiniNote_1 obj1 = new MiniNote_1();
        Note15_1 obj2 = new Note15_1();
        System.out.println(obj1.getName() + " cost:" + obj1.getCost() + ", price:" + obj1.getPrice());
        System.out.println(obj2.getName() + " cost:" + obj2.getCost() + ", price:" + obj2.getPrice());
    }
}
