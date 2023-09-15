/**
 * 두 수의 나눗셈
	문제 설명
	정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 
	return 하도록 soltuion 함수를 완성해주세요.
	
	제한사항
	0 < num1 ≤ 100
	0 < num2 ≤ 100
	입출력 예
	num1	num2	result
	3	2	1500
	7	3	2333
	1	16	62
	입출력 예 설명
	입출력 예 #1
	
	num1이 3, num2가 2이므로 3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.
	입출력 예 #2
	
	num1이 7, num2가 3이므로 7 / 3 = 2.33333...에 1,000을 곱하면 2333.3333.... 이 되며, 
	정수 부분은 2333입니다.
	입출력 예 #3
	
	num1이 1, num2가 16이므로 1 / 16 = 0.0625에 1,000을 곱하면 62.5가 되며, 정수 부분은 62입니다.
 */
package com.moon.main;

public class Sol01 {
	public int solution(int num1, int num2) {
		double divisionResult = (double) num1 / num2; // 나눗셈 결과를 실수로 계산
        int result = (int) (divisionResult * 1000); // 나눗셈 결과에 1000을 곱하고 정수 부분만 취함
        return result; 
	}
	 public static void main(String[] args) {
		 Sol01 solution = new Sol01();
	        int num1 = 3;
	        int num2 = 2;
	        int result = solution.solution(num1, num2);
	        System.out.println(result);

	        num1 = 7;
	        num2 = 3;
	        result = solution.solution(num1, num2);
	        System.out.println(result);

	        num1 = 1;
	        num2 = 16;
	        result = solution.solution(num1, num2);
	        System.out.println(result);
	    }
}
