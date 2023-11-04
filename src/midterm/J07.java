package midterm;

class Dates{
    String[] weeks = new String[] {"", "Mon", "Thu", "Wed", "Tus", "Fri", "Sat", "Sun"};
    public String askDates(int i){
        return weeks[i];
    }
}
public class J07 {
    public static void main(String[] args){
        Dates obj = new Dates();
        for(int i=1; i < 8;i++){
            System.out.println(obj.askDates(i));
        }
    }
}
