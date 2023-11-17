package case_study_1;

class LCD_2{
    int inch_10 = 2000;
    int inch_15 = 2500;
    int inch_17 = 3000;
}
class CPU_2 extends LCD_2{
    int speed_166 = 6000;
    int speed_220 = 8000;
    int speed_240 = 11000;
}
class HD_2 extends CPU_2{
    int G_120 = 2400;
    int G_160 = 2800;
}
// (1)
class PC_2 extends HD_2{
    int speed = speed_240;
    int HD_2 = G_160;
    int cost = (speed + HD_2) + 500;
    double price = (speed + HD_2) * 1.8;
    int getCost(){
        return cost;
    }
    double getPrice(){
        return price;
    }
    String name;
    String getName(){
        name = "PC";
        return name;
    }
}
// (2)
class MultiPC_2 extends HD_2{
    int speed = speed_240;
    int HD_2 = G_160;
    int speed_n = 0;
    int HD_n = 0;
    double cost;
    double price;
    double getCost(){
        cost = (speed*speed_n + HD_2*HD_n) * 1.2;
        return cost;
    }
    double getPrice(){
        price = (speed*speed_n + HD_2*HD_n) * 1.8;
        return price;
    }
    MultiPC_2(int s, int h){
        speed_n = s;
        HD_n = h;
    }
    String name;
    String getName(){
        name = "MultiPC";
        return name;
    }
}
public class JPD06_2 {
    public static void main(String[] args) {
        // (3)
        PC_2 obj1 = new PC_2();
        MultiPC_2 obj2 = new MultiPC_2(2, 4);
        MultiPC_2 obj3 = new MultiPC_2(4, 8);
        System.out.println(obj1.getName() + " cost:" + obj1.getCost() + ", price:" + obj1.getPrice());
        System.out.println(obj2.getName() + ": " + obj2.speed_n + "CPU,  "+ obj2.HD_n + "HD, cost:" + obj2.getCost() + ", price:" + obj2.getPrice());
        System.out.println(obj3.getName() + ": " + obj3.speed_n + "CPU,  "+ obj3.HD_n + "HD, cost:" + obj3.getCost() + ", price:" + obj3.getPrice());
    }
}
