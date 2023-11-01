package chap11;

interface Data08{
    public void showData08();
}
interface Test08{
    public void showScore();
    public double calcu();
}
class Stu08 implements Data08, Test08{
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;
    Stu08(String a, String b, int c, int d, int e){
        this.id = a;
        this.name = b;
        this.mid = c;
        this.finl = d;
        this.common = e;
    }

    @Override
    public void showData08() {
        System.out.println("學號：" + id);
        System.out.println("姓名：" + name);
    }

    @Override
    public void showScore() {
        System.out.println("期中成績：" + mid);
        System.out.println("期末成績：" + finl);
        System.out.println("平時成績：" + common);
    }

    @Override
    public double calcu() {
        return mid*0.3 + finl*0.3 + common*0.4;
    }
    public void show(){
        showData08();
        showScore();
        System.out.println("學期成績：" + calcu());
    }
}
public class Class08 {
    public static void main(String[] args) {
        Stu08 Stu08 = new Stu08("940001", "Fiona", 90, 92, 85);
        Stu08.show();
    }
}
