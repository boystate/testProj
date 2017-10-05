package myproj2;

import java.util.Scanner;

public class MyProj2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A : ");
        double a = s.nextDouble();
        System.out.print("Enter B : ");
        double b = s.nextDouble();
        System.out.println("Avg = " + (a+b/2));
        
    }
    
}
