//Sum of Two numbers without using + operator

import java.util.Scanner;

public class Test2b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();
        int carry;
        num1 = num1 - (-num2);
        System.out.println("Sum is : " + num1);
    }

}
