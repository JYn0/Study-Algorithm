package day05;
// �������� ���� ����
import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int numc = completion.length; 
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        int num=0;
        for(int i=0; i<numc; i++) {
            if(participant[i].equals(completion[i])) {
                num ++;
            }else{
                break;
            }
        }
        answer = participant[num];   
        return answer;
    }
}