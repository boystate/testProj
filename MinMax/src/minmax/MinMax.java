package minmax;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("กดปุ่ม a เพื่อหาค่าสูงสุดหรือ b เพื่อหาค่าต่ำสุด");
        String inputab = kb.next();
        switch(inputab){
            case "a" :
                System.out.println("กรอกตัวเลขที่ต้องการหาค่าสูงสุด 5 จำนวน");
                int MaxNumber[] = new int[5];
                int Max[] = new int[1];
                    for(int i=0;i<5;i++){
                        System.out.println("Number["+(i+1)+"]");
                        MaxNumber[i] = kb.nextInt();
                    }
                    Max[0]=MaxNumber[0];
                    for(int i=0;i<5;i++){
                        if(MaxNumber[i]>Max[0]){
                            Max[0]=MaxNumber[i];
                        }
                    }
                    System.out.println("ค่าสูงสุด = "+Max[0]);
                    break;
            case "b" :
                System.out.println("กรอกตัวเลขที่ต้องการหาค่าต่ำสุด 5 จำนวน");
                int MinNumber[] = new int[5];
                int Min[] = new int[1];
                    for(int i=0;i<5;i++){
                        System.out.println("Number["+(i+1)+"]");
                        MinNumber[i] = kb.nextInt();
                    }
                    Min[0]=MinNumber[0];
                    for(int i=0;i<5;i++){
                        if(MinNumber[i]<Min[0]){
                            Min[0]=MinNumber[i];
                        }
                    }
                    System.out.println("ค่าต่ำสุด = "+Min[0]);
                    break;
        }
    }
}
