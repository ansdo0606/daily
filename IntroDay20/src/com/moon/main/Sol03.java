/**
 * 최댓값 만들기 (2)
	문제 설명
	정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 
	return하도록 solution 함수를 완성해주세요.
	
	제한사항
	-10,000 ≤ numbers의 원소 ≤ 10,000
	2 ≤ numbers 의 길이 ≤ 100
	입출력 예
	numbers	result
	[1, 2, -3, 4, -5]	15
	[0, -31, 24, 10, 1, 9]	240
	[10, 20, 30, 5, 5, 20, 5]	600
	입출력 예 설명
	입출력 예 #1
	
	두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.
	입출력 예 #2
	
	두 수의 곱중 최댓값은 10 * 24 = 240 입니다.
	입출력 예 #3
	
	두 수의 곱중 최댓값은 20 * 30 = 600 입니다.
 */
package com.moon.main;

public class Sol03 {
	public static int solution(int[] numbers) {        
        int maxValue = Integer.MAX_VALUE * -1;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                if(maxValue < numbers[i] * numbers[j] && i!=j) {
                    maxValue = numbers[i] * numbers[j];
                }
            }
        }

        return maxValue;
    }
	 public static void main(String[] args) {

	        int[] numbers1 = {1, 2, -3, 4, -5};
	        int result1 = solution(numbers1);
	        System.out.println(result1); // 15 출력

	        int[] numbers2 = {0, -31, 24, 10, 1, 9};
	        int result2 = solution(numbers2);
	        System.out.println(result2); // 240 출력

	        int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};
	        int result3 = solution(numbers3);
	        System.out.println(result3); // 600 출력
	    }
}
