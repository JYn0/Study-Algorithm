package day05;
// K¹øÂ° ¼ö
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int csize = commands.length;
        int[] answer = new int[csize];
        
		for(int i=0; i<csize; i++) { 
			int ct = commands[i][0];
			int ctt = commands[i][1];
			int cttt = commands[i][2] - 1;
			int temp = ctt - ct +1; 
			int newarr[] = new int[temp];
			for(int j=0; j<temp; j++) {
				newarr[j] = array[ct-1+j];
			}
			Arrays.sort(newarr);
			answer[i] = newarr[cttt];
		}		
        return answer;
    }
}