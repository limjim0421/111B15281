package chap09;

public class Class17 {

    // (a)
    static class Phone{
        static String company;
        static String cell;
        // (b)
        public Phone(String s1, String s2){
            company = s1;
            cell = s2;
        }
    }
    public static void main(String[] args) {
        class Namecard {
            private String name;
            private String address;
            private Phone data;

            // (c)
            void show(){
                System.out.println("好友姓名:"+name);
                System.out.println("聯絡地址:"+address);
                System.out.println("公司電話:"+data.cell);
                System.out.println("手機號碼:"+data.company);
            }
            public Namecard(String s1, String s2, String s3, String s4){
                name = s1;
                address = s2;
                data.cell = s3;
                data.company = s4;
            }
            public Namecard(){

            }
        }

        Namecard nc = new Namecard();
        nc.show();
        // (d)
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        first.show();
    }
}
