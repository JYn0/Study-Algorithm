package day02;

import java.util.Scanner;

public class A24 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 몇번 받을 지 입력
        int num = sc.nextInt();
        
        // 반복 수, 단어 입력
        int tnum[] = new int[num];
        String word[] = new String[num];
        
        for(int i=0; i<num; i++) {
            tnum[i] = sc.nextInt();
            word[i] = sc.next();
        }
        
        // 출력
        for(int i=0; i<num; i++) { // 총 갯수
            String out[] = word[i].split("");    // n번째 단어의 철자를 배열에 각각 넣음
            for(int j=0; j<out.length; j++) {    
                for(int k=0; k<tnum[i]; k++) {    // tnum번 출력
                    System.out.print(out[j]);    // n번째 자리 글자를
                }
            }
            System.out.println();
        }
        sc.close();
    }
 
}