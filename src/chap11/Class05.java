package chap11;

interface iAaa{
    public void show();
}
class Bbb{
    public int num=10;
    public void set(int n){
        num=n;
    }
}
class Ccc extends Bbb implements iAaa{
    @Override
    public void show() {
        System.out.println("ans="+num);
    }
}
public class Class05 {
    public static void main(String[] args) {
        Ccc obj=new Ccc();
        obj.set(5);
        obj.show();
    }
}
