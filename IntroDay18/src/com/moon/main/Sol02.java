/**
 * 제곱수 판별하기
	문제 설명
	어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 
	아니라면 2를 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ n ≤ 1,000,000
	입출력 예
	n	result
	144	1
	976	2
	입출력 예 설명
	입출력 예 #1
	
	144는 12의 제곱이므로 제곱수입니다. 따라서 1을 return합니다.
	입출력 예 #2
	
	976은 제곱수가 아닙니다. 따라서 2를 return합니다.
 */
package com.moon.main;

public class Sol02 {
	 public static int solution(int n) {
	        // n이 음수일 경우 제곱수가 아니므로 2를 반환
	        if (n < 0) {
	            return 2;
	        }

	        // n의 제곱근을 구하여 정수 부분만 취함
	        int sqrt = (int) Math.sqrt(n);

	        // n의 제곱근을 제곱하여 원래 수 n과 비교
	        if (sqrt * sqrt == n) {
	            return 1; // n이 제곱수인 경우
	        } else {
	            return 2; // n이 제곱수가 아닌 경우
	        }
	    }

	    public static void main(String[] args) {

	        int n1 = 144;
	        int result_1 = solution(n1);
	        System.out.println(result_1); // 결과 출력: 1

	        int n2 = 976;
	        int result_2 = solution(n2);
	        System.out.println(result_2); // 결과 출력: 2
	    }
}
