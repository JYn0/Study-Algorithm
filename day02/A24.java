package day02;

import java.util.Scanner;

public class A24 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ��� ���� �� �Է�
        int num = sc.nextInt();
        
        // �ݺ� ��, �ܾ� �Է�
        int tnum[] = new int[num];
        String word[] = new String[num];
        
        for(int i=0; i<num; i++) {
            tnum[i] = sc.nextInt();
            word[i] = sc.next();
        }
        
        // ���
        for(int i=0; i<num; i++) { // �� ����
            String out[] = word[i].split("");    // n��° �ܾ��� ö�ڸ� �迭�� ���� ����
            for(int j=0; j<out.length; j++) {    
                for(int k=0; k<tnum[i]; k++) {    // tnum�� ���
                    System.out.print(out[j]);    // n��° �ڸ� ���ڸ�
                }
            }
            System.out.println();
        }
        sc.close();
    }
 
}