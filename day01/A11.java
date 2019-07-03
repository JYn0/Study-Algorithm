package day01;

import java.util.Scanner;

public class A11 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        
        int result = arr.length;
        System.out.println(result);
        
        sc.close();
    }
}