package day02;

import java.util.Scanner;

public class A23 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
 
        for(char x='a'; x<='z'; x++) {
            System.out.print(input.indexOf(x)+" ");
        }
        sc.close();
    }
}