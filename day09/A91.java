package al;

public class A83 {

	public static void main(String[] args) {
		int prices[] = {1,2,3,2,3};
		int answer[] = new int[prices.length];
		
		
		int cnt = 0;
		for(int i=0; i<prices.length-1; i++) {
			outer: for(int j=i+1; j<=prices.length-1; j++) {
				if(prices[i] <= prices[j]) {
					cnt++;
				}else {
					cnt++;
					break outer;
				}
			}
			answer[i] = cnt;
			cnt = 0;
		}
//		for(int tmp:answer) {
//			System.out.println(tmp);
//		}
		
	}
}
