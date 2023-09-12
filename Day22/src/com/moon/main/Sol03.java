/**
 * 문자열로 변환
	문제 설명
	정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ n ≤ 10000
	입출력 예
	n	result
	123	"123"
	2573	"2573"
	입출력 예 설명
	입출력 예 #1
	
	123을 문자열로 변환한 "123"을 return합니다.
	입출력 예 #2
	
	2573을 문자열로 변환한 "2573"을 return합니다.
 */
package com.moon.main;

public class Sol03 {
	public String solution(int n) {
        String result = String.valueOf(n); // 정수를 문자열로 변환
        return result;
    }

    public static void main(String[] args) {
    	Sol03 solution = new Sol03();
        int n1 = 123;
        String result1 = solution.solution(n1);
        System.out.println(result1); // 예상 출력: "123"

        int n2 = 2573;
        String result2 = solution.solution(n2);
        System.out.println(result2); // 예상 출력: "2573"
    }
}
