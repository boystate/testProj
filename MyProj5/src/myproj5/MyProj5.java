package myproj5;

import java.util.Scanner;

public class MyProj5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.print("Number 1 : ");
            int num1 = s.nextInt();
            System.out.print("Number 2 : ");
            int num2 = s.nextInt();
            System.out.print("Number 3 : ");
            int num3 = s.nextInt();
            if(num1>num2&&num1>num3){
                System.out.println("Max is " + num1);
            }else if(num2>num3){
                System.out.println("Max is " + num2);
            }else{
                System.out.println("Max is " + num3);
            }
    }
    
}
