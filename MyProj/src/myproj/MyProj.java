package myproj;

import java.util.Scanner;

public class MyProj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = s.nextInt();
        System.out.print("Enter b : ");
        int b = s.nextInt();
        System.out.print("Enter c : ");
        int c = s.nextInt();
        //int sum = a+b+c;
        System.out.println("a+b+c = " + (a+b+c));
    }
}
