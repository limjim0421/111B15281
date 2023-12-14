package chap13;

public class Ex05 {
    public static void main(String[] args){
        int num=5;
        int[] d={3, 0, 0, 1};
        for(int i=0;i<d.length;i++){
            try {
                int ans=num/d[i];
                System.out.println(num+"/"+d[i]+"= "+ans);
            } catch (ArithmeticException e) {
                System.out.println("除數為0不計算");
            }finally{

            }
        }
    }
}
