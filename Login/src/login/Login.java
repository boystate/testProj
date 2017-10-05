package login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Username : ");
        String username = s.next();
        System.out.print("Password : ");
        String password = s.next();
        if(username.equals("admin")&&password.equals("1234")){
            System.out.println("Login Successful!");
        }else{
            System.out.println("Login Failed!");
        }
    }
    
}
