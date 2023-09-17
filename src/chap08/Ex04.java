package chap08;
class CBox2{ //與Ex05的CBox衝突故改名CBox2
    int length;
    int width;
    int height;
}
public class Ex04 {
    public static void main(String[] args) {
        CBox2 box = new CBox2(); //與Ex05的CBox衝突故改名CBox2

        box.length = 15;
        box.width = 10;
        box.height = 25;

        System.out.println("length= " + box.length);
        System.out.println("width= " + box.width);
        System.out.println("height= " + box.height);
    }
}
