package day04;

import java.util.Scanner;

public class A42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // ¸î¹ø
		int kn[][] = new int[t][2];
		for(int i=0; i<t; i++) {
			kn[i][0] = sc.nextInt(); // kÃþ
			kn[i][1] = sc.nextInt(); // nÈ£
		}
		sc.close();
		
		int sum[][] = new int[15][15];
		sum[0][0]=0;
		
		for(int i=1; i<sum.length; i++) { // 0Ãþ nÈ£±îÁö
			sum[0][i] = i;
		}
		for(int i=0; i<sum.length; i++) { // kÃþ 0È£
			sum[i][0] = 0;
		}
		
		for(int i=1; i<sum.length; i++) { // kÃþ
			for(int j=1; j<sum.length; j++) { // nÈ£
				int temp=0;
				for(int l=1; l<=j; l++) {
					temp += sum[i-1][l];
				}
				sum[i][j] = temp;
			}
		}
		
		
		
//		for(int i=sum.length; i>=0; i--) {
//			for(int j=0; j<sum.length; j++) {
//				System.out.print(sum[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		for(int i=0; i<t; i++) {
			System.out.println(sum[kn[i][0]][kn[i][1]]);
		}
		
	}

}
