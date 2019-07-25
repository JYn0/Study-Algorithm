
// 두 정수 사이의 합

class Solution {
  public long solution(int a, int b) {
        long answer = 0;
        int size=0;
	    if(a > b){
	    	size = a - b ;
	        for(int i=0; i<=size; i++){
	        	answer += b;
	        	b++;
	        }
	    } else if(a < b){
	    	size = b - a;
	    	for(int i=0; i<=size; i++){
		        answer += a;
		        a++;
	    	}
	    } else{
	    	answer = a;
	    }
      
      return answer;
  }
}
