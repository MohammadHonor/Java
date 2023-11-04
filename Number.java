import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("from 5 to 1");
        printNumber1(num);
        System.out.println("from 1 to 5");
        printNumber2(num);
    }
    static void printNumber1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber1(n-1);
    }
    static void printNumber2(int n){
        if(n==0){
            return;
        }

        printNumber2(n-1);
        System.out.println(n);
    }
}
