/**
 * 최댓값 만들기 (1)
	문제 설명
	정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 
	return하도록 solution 함수를 완성해주세요.
	
	제한사항
	0 ≤ numbers의 원소 ≤ 10,000
	2 ≤ numbers의 길이 ≤ 100
	입출력 예
	numbers	result
	[1, 2, 3, 4, 5]	20
	[0, 31, 24, 10, 1, 9]	744
	입출력 예 설명
	입출력 예 #1
	
	두 수의 곱중 최댓값은 4 * 5 = 20 입니다.
	입출력 예 #1
	
	두 수의 곱중 최댓값은 31 * 24 = 744 입니다.
 */
package com.moon.main;

import java.util.Arrays;

public class Sol03 {
	 public int solution(int[] numbers) {
	        Arrays.sort(numbers); // 배열을 오름차순으로 정렬
	        int n = numbers.length;

	        // 가장 큰 두 수를 선택하여 곱함
	        int maxProduct = numbers[n - 1] * numbers[n - 2];

	        return maxProduct;
	    }

	    public static void main(String[] args) {
	    	Sol03 solution = new Sol03();
	        int[] numbers1 = {1, 2, 3, 4, 5};
	        System.out.println(solution.solution(numbers1)); // 출력: 20

	        int[] numbers2 = {0, 31, 24, 10, 1, 9};
	        System.out.println(solution.solution(numbers2)); // 출력: 744
	    }
}
