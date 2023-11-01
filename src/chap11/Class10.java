package chap11;

interface Data10{
    public void best();
    public void failed();
}
interface Test10 extends Data10{
    public void showData();
    public double average();
}
class Stu10 implements Test10{
    protected String name;
    protected int math;
    protected int english;

    Stu10(String x, int y, int z){
        this.name = x;
        this.math = y;
        this.english = z;
    }
    @Override
    public void best() {
        String result="";
        if(english > math){
            result = name + "的英文比數學好";
        }else if(english < math){
            result = name + "的數學比英文好";
        }else{
            result = name + "的英文跟數學一樣好";
        }
        System.out.println(result);
    }

    @Override
    public void failed() {
        String result="";
        if(english < 60){
            System.out.println(name + "的英文當掉了");
        }
        if(math < 60){
            System.out.println(name + "的數學當掉了");
        }

    }

    @Override
    public void showData() {
        System.out.println("姓名："+name);
        System.out.println("數學成績："+math);
        System.out.println("英文成績："+english);
        System.out.println("平均成績："+average());
    }

    @Override
    public double average() {
        return (double)(math+english)/2;
    }
    public void show(){
        showData();
        best();
        failed();
    }
}
public class Class10 {
    public static void main(String[] args) {
        Stu10 s = new Stu10("Judy", 58, 91);
        s.show();
    }
}
