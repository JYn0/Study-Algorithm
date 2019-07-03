package day02;

import java.util.Scanner;

public class A22 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); // NÀÚ¸´¼ö
        String str = sc.next();
//        String input [] = new String[num];
//        input= str.split("");
        String input[] = str.split("");
 
        int result = 0;
        for(int i=0; i<num; i++) {
            result += Integer.parseInt(input[i]);
        }
        System.out.println(result);
        sc.close();
    }
}