package day01;

import java.util.Scanner;

public class A13 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        String input = "OOXXOXXOOO";
        String arr[] = input.split("");
    
        int sum = 0;
        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            
            if (arr[i].equals("O")) {
                sum += 1+cnt;
                cnt++;
            }else {
                cnt = 0;
            }
        }
        System.out.println(sum);
        sc.close();
    }
    
}
