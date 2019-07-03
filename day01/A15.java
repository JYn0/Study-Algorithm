package day01;

public class A15 {
	 
    public static void main(String[] args) {
        int score[] = {10, 65, 100, 30, 95};
        
        int sum = 0;
        for(int i=0; i<score.length; i++) {
            if(score[i] < 40) {
                score[i] = 40;
            }
            sum += score[i];
        }
        int result = sum / score.length;
        
        System.out.println(result);
    }
 
}
