package myproj3;

import java.util.Scanner;

public class MyProj3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Name : ");
        String name = s.next();
        System.out.print("Surname : ");
        String surname = s.next();
        System.out.print("Age : ");
        int age = s.nextInt();
        System.out.println("You name is " +name+" "+surname+". You are "+age+" years old.");
        
    }
}
