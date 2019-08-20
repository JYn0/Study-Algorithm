# 백준 - 음계

**문제**

다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.

1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

**입력**

첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

**출력**

첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

| 예제 입력           | 예제 출력      |
| --------------- | ---------- |
| 1 2 3 4 5 6 7 8 | ascending  |
| 8 7 6 5 4 3 2 1 | descending |
| 8 1 7 2 6 3 5 4 | mixed      |

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input[] = new int[8];
		for(int i=0;i<input.length;i++) {
			input[i] = sc.nextInt();
		}
		
		int acnt = 0;
		int dcnt = 0;
		String result = "";
		for(int i=0; i<input.length-1; i++) {
			if(input[i]+1 == input[i+1]) {
				acnt++;
			}else if(input[i]-1 == input[i+1]) {
				dcnt++;
			}
			
			if(acnt==input.length-1) {
				result = "ascending";
			}else if(dcnt==input.length-1) {
				result = "descending";
			}else{
				result = "mixed";
			}
		}
		System.out.println(result);
		sc.close();
	}
}

```

