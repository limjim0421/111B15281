package midterm;

abstract class CShape2{
    public int number;
    public int totalAngle;
    public abstract void angle();
    @Override
    public String toString(){
        return "正" + number + "邊形每一腳為" + (totalAngle/number) + "度";
    }
    /*
    class CTriangle{
        CTriangle(int n){
            number = n;
        }
        @Override
        void angle(){
            totalAngle = (number-2) * 180;
        }
    }
    class CRect{
        CRect(int n){
            number = n;
        }
        @Override
        void angle(){
            totalAngle = (number-2) * 180;
        }
    }
    class CPentagon{
        CPentagon(int n){
            number = n;
        }
        @Override
        void angle(){
            totalAngle = (number-2) * 180;
        }
    }
    */
    // 非法的繼承宣告 如果要繼承必須使用extends 而不是直接寫在父類別裡面
}
// 修正過後便可執行
class CTriangle2 extends CShape2{
    CTriangle2(int n){
        number = n;
    }
    @Override
    public void angle(){
        totalAngle = (number-2) * 180;
    }
}
class CRect2 extends CShape2{
    CRect2(int n){
        number = n;
    }
    @Override
    public void angle(){
        totalAngle = (number-2) * 180;
    }
}
class CPentagon2 extends CShape2{
    CPentagon2(int n){
        number = n;
    }
    @Override
    public void angle(){
        totalAngle = (number-2) * 180;
    }
}
public class J152{
    public static void main(String[] args){
        CShape2[] obj = new CShape2[3];
        obj[0] = new CTriangle2(3);
        obj[1] = new CRect2(4);
        obj[2] = new CPentagon2(5);
        for(int i=0;i<3;i++){
            obj[i].angle();
            System.out.println(obj[i]);
        }
    }
}
