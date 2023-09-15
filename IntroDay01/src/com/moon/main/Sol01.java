/**
 * 두 수의 합
	문제 설명
	정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
	
	제한사항
	-50,000 ≤ num1 ≤ 50,000
	-50,000 ≤ num2 ≤ 50,000
	입출력 예
	num1	num2	result
	2	3	5
	100	2	102
	입출력 예 설명
	입출력 예 #1
	
	num1이 2이고 num2가 3이므로 2 + 3 = 5를 return합니다.
	입출력 예 #2
	
	num1이 100이고 num2가 2이므로 100 + 2 = 102를 return합니다.
 */
package com.moon.main;

public class Sol01 {
	public int solution(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
    	Sol01 solution = new Sol01();
        int num1 = 2;
        int num2 = 3;
        int result = solution.solution(num1, num2);
        System.out.println(result);

        num1 = 100;
        num2 = 2;
        result = solution.solution(num1, num2);
        System.out.println(result);
    }
}
