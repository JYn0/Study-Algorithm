package day03;

import java.util.Scanner;

public class A34 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        int temp = fibo(num);
        System.out.println(temp);
    }
    
 
    public static int fibo(int num) {
        int result = 1;
        int b= 1;
        if(num == 0) {
            return 0;
        }else {
            while(num >= 2) {
                b = result+b;
                result = b-result;
                //System.out.println(result);
                num--;
            }
        }
        
        return result;
    }
 
}
