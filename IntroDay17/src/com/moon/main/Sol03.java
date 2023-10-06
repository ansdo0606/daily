/**
 * 자릿수 더하기
	문제 설명
	정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
	
	제한사항
	0 ≤ n ≤ 1,000,000
	입출력 예
	n	result
	1234	10
	930211	16
	입출력 예 설명
	입출력 예 #1
	
	1 + 2 + 3 + 4 = 10을 return합니다.
	입출력 예 #2
	
	9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
 */
package com.moon.main;

public class Sol03 {
	public static int solution(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10; // n의 일의 자리 숫자를 더합니다.
            n /= 10; // n을 한 자리씩 줄입니다.
        }
        
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(solution(1234));    // 출력: 10
        System.out.println(solution(930211));  // 출력: 16
    }
}
