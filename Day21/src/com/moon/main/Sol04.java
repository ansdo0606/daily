/**
 * 문자열 정수의 합
	문제 설명
	한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	3 ≤ num_str ≤ 100
	입출력 예
	num_str	result
	"123456789"	45
	"1000000"	1
	입출력 예 설명
	입출력 예 #1
	
	문자열 안의 모든 숫자를 더하면 45가 됩니다.
	입출력 예 #2
	
	문자열 안의 모든 숫자를 더하면 1이 됩니다.
 */
package com.moon.main;

public class Sol04 {
	 public int solution(String num_str) {
	        int sum = 0;

	        for (int i = 0; i < num_str.length(); i++) {
	            char digitChar = num_str.charAt(i); // 문자열에서 한 자리 수를 추출
	            int digit = Character.getNumericValue(digitChar); // 문자를 정수로 변환
	            sum += digit; // 합계에 더하기
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	    	Sol04 solution = new Sol04();
	        String num_str1 = "123456789";
	        int result1 = solution.solution(num_str1);
	        System.out.println(result1); // 예상 출력: 45

	        String num_str2 = "1000000";
	        int result2 = solution.solution(num_str2);
	        System.out.println(result2); // 예상 출력: 1
	    }
}
