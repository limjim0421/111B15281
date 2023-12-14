package chap13;

class OutException extends Exception { // (b)
}
class InException extends Exception { // (c)
}
class CenterException extends Exception { // (a)
}

public class Ex12 {
    public static void main(String[] args) {
        double radius=10.0;
        double x1=5.3;
        double y1=6.8;
        double x2=0.2;
        double y2=9.5;
        double dist;
        try {
            dist=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            if(dist <= radius){
                // (c)
                throw new InException();
            }else if (dist == radius) {
                // (a)
                throw new CenterException();
            }else{
                // (b)
                throw new OutException();
            }
        }catch (OutException e){ // (a)
            // (b)
            System.out.print("("+x1+","+y1+")");
            System.out.print("不在半徑"+radius);
            System.out.println(", 圓心("+x2+","+y2+")的園內");
        } catch (CenterException e) { // (c)
            // (a)
            System.out.print("("+x1+","+y1+")");
            System.out.print("在半徑"+radius);
            System.out.println(", 圓心("+x2+","+y2+")的園上");
        } catch (InException e) { // (b)
            // (c)
            System.out.print("("+x1+","+y1+")");
            System.out.print("在半徑"+radius);
            System.out.println(", 圓心("+x2+","+y2+")的園內");
        }
    }
}
