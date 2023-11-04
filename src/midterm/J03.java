package midterm;

class Data{
    // (1)
    class Test{
        int english;
        int math;
        // (2)
        Test(int eng, int m){
            this.english = eng;
            this.math = m;
        }
        // (3)
        public double avg(){
            return (english + math) / 2;
        }
        // (4)
        public void show(){
            System.out.printf("english socre：%d\n", english);
            System.out.printf("math score：%d\n", math);
            System.out.println("avg：" + avg());
            if (english >= 60 & math >= 60){
                System.out.println("You are all pass");
            }else if(english < 60){
                System.out.println("english is fail");
            }else if(math < 60){
                System.out.println("math is fail");
            }
        }
    }
    private String name;
    private Test score;
    // (5)
    Data(String n, int eng, int m){
        this.name = n;
        this.score = new Test(eng, m);
    }
    public void show(){
        System.out.printf("name：%s\n" , name);
        score.show();
    }
}
public class J03 {
    public static void main(String[] args) {
        // (5)
        Data stu = new Data("Annie", 85, 56);
        Data stu1 = new Data("James", 85, 96);
        stu.show();
        System.out.println("--------------------");
        stu1.show();
    }
}

