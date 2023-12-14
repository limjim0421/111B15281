package chap13;

import java.util.Scanner;

class IntegerlessThanZero extends Exception { // (a)
}
class IntegerGreaterThanZero extends Exception { // (c)
}
class IntegerEqualThanZero extends Exception { // (b)
}
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try{
            n = sc.nextInt();
            if (n < 0){
                throw new IntegerlessThanZero();
            }else if(n > 0){
                throw new IntegerGreaterThanZero();
            }else{
                throw new IntegerEqualThanZero();
            }
        } catch (IntegerlessThanZero e) {
            System.out.println("您輸入的整數的值小於0");
        } catch (IntegerGreaterThanZero e){
            System.out.println("您輸入的整數的值大於0");
        } catch (IntegerEqualThanZero e){
            System.out.println("您輸入的整數的值為0");
        }
    }
}
