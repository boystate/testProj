package checkage;

import java.util.Scanner;

public class CheckAge {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = s.nextInt();
        if(age>=18&&age<=60){
            System.out.println("คุณมีสิทธิ์เข้าได้");
        }else{
            System.out.println("คุณไม่มีสิทธิ์เข้า");
        }
    }
    
}
