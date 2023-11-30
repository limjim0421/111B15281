package chap12.bbb;

public class Average { // 要是如題沒有給public 會不能import
    private int sum=0;
    private int end;
    private double avg;
    public Average(int e){
        end=e;
    }
    public double averg(){
        for(int i=1;i<=end;i++){
            sum+=i;
        }
        avg=(double)sum/end;
        return avg;
    }
}
