//  같은 숫자는 싫어

import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int cnt = 0;
        int arrsize = arr.length;
		
		for (int i = 1; i < arrsize; i++) {
			if (arr[i-1] == arr[i]) {
				cnt++;
			}
		}

        int anssize = arrsize-cnt;
		int[] answer = new int[anssize];
		int cntcnt=0;
		
		for(int i=0; i<arrsize-1; i++) {
			if(arr[i] != arr[i+1]) {
				answer[cntcnt] = arr[i];
				cntcnt++;
			}
		}
		
		answer[anssize-1] = arr[arrsize-1];
        return answer;
	}
}
