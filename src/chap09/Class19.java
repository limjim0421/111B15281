package chap09;

public class Class19 {

    // (a)
    static class Data{
        static class Test{
            static int english;
            static int math;
            // (b)
            Test(int eng, int m){
                english = eng;
                math = m;
            }
            // (c)
            static double avg(){
                return (english+math)/2f;
            }
        }
        private String name;
        private Test score;

        // (d)
        void show(){
            System.out.println("學生姓名:"+name);
            System.out.println("英文成績:"+ Test.english);
            System.out.println("數學成績:"+ Test.math);
            System.out.println("平均成績:"+ Test.avg());
        }

        public Data(String s1, int n1, int n2){
            name = s1;
            Test.english = n1;
            Test.math = n2;
        }
    }
    public static void main(String[] args) {
        // (e)
        Data stu=new Data("Annie", 85, 92);
        stu.show();
    }
}
