/**
 * 짝수는 싫어요
	문제 설명
	정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ n ≤ 100
	입출력 예
	n	result
	10	[1, 3, 5, 7, 9]
	15	[1, 3, 5, 7, 9, 11, 13, 15]
	입출력 예 설명
	입출력 #1
	
	10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
	입출력 #1
	
	15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
 */
package com.moon.main;

public class Sol04 {
	 public static int[] solution(int n) {
	        int[] oddNumbers = new int[(n + 1) / 2]; // 홀수의 개수만큼 배열 크기 설정
	        int index = 0;

	        for (int i = 1; i <= n; i += 2) {
	            oddNumbers[index++] = i;
	        }

	        return oddNumbers;
	    }
	 public static void main(String[] args) {
	        int n1 = 10;
	        int[] result1 = solution(n1);
	        for (int num : result1) {
	            System.out.print(num + " ");
	        }
	        // 1 3 5 7 9 출력

	        int n2 = 15;
	        int[] result2 = solution(n2);
	        for (int num : result2) {
	            System.out.print(num + " ");
	        }
	        // 1 3 5 7 9 11 13 15 출력
	    }
}
