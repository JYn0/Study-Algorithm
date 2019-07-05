package day04;

import java.util.Scanner;

public class A41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		int sum = 1;
		int cnt = 0;
		while (sum <= X) {
			sum += cnt++;
			// System.out.println("sum : "+ sum+" cnt : "+ cnt);
		}
		
		int d = 0, n = 0;
		if(cnt%2 == 1) {
			d = sum - X;
			n = cnt - d;
		}else {
			n = sum - X;
			d = cnt - n;
		}
		
		System.out.println(n + "/" + d);

	}

}
