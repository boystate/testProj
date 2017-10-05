package myproj4;

import java.util.Scanner;

public class MyProj4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = s.nextDouble();
        System.out.print("Enter b : ");
        double b = s.nextDouble();
        System.out.println("c is " + Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
    }
}
