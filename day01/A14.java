package day01;

public class A14 {
	 
    public static void main(String[] args) {
//        int input[] = {1, 2, 3, 4, 5, 6, 7, 8};
//        int input[] = {8, 7, 6, 5, 4, 3, 2, 1};
        int input[] = {8, 1, 7, 2, 6, 3, 5, 4};
        
        String result = "";
        for(int i=0; i<input.length-2; i++) {
            if(input[i]+1 == input[i+1]) {
                result = "ascending";
            }else if(input[i]-1 == input[i+1]) {
                result = "descending";
            }else {
                result = "mixed";
            }
        }
        System.out.println(result);
    }
}