package day01;

import java.util.Scanner;

public class A12 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
//        int A = 150;
//        int B = 266;
//        int C = 427;
        
        int result = A * B * C;
//        System.out.println(result);
        
        String st = String.valueOf(result); // int to String
        String arrst[] = st.split("");
        int arrit[] = new int[st.length()];
        
        for(int i=0; i<st.length(); i++) {
            arrit[i] = Integer.parseInt(arrst[i]); // data를 int 배열에 넣기
        }
        
        int cnt = 0;
        int arrcnt[] = new int[10]; // 0~9 갯수
 
        for(int i=0; i<arrcnt.length; i++) {
            for(int j=0; j<arrit.length; j++) {
                if(i == arrit[j]) {
                    cnt++;
                }
            }
            arrcnt[i] = cnt;
            cnt = 0;
        }
        
        for(int i=0; i<arrcnt.length; i++) {
            System.out.println(arrcnt[i]);
        }
        
        sc.close();
    }
}
 
