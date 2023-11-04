package midterm;

abstract class CShape{
    public int number;
    public int totalAngle;
    public abstract void angle();
    // (b)
    @Override
    public String toString(){
        return "正" + number + "邊形的每一個角為" + totalAngle/number + "度";
    }
}
// (a)
class CTriangle extends CShape{
    @Override
    public void angle(){
        number = 3;
        totalAngle = (number-2)*180;
    }
}
class CRect extends CShape{
    @Override
    public void angle(){
        number = 4;
        totalAngle = (number-2)*180;
    }
}
class CPentagon extends CShape{
    @Override
    public void angle(){
        number = 5;
        totalAngle = (number-2)*180;
    }
}
public class J15 {
    public static void main(String[] args){
        // (c)
        CShape[] obj = new CShape[3];
        obj[0] = new CTriangle();
        obj[1] = new CRect();
        obj[2] = new CPentagon();
        for (int i=0;i < 3;i++){
            obj[i].angle();
            System.out.println(obj[i]);
        }
    }
}

