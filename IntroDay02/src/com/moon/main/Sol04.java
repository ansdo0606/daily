/**
 * 배열 두배 만들기
	문제 설명
	정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 
	return하도록 solution 함수를 완성해주세요.
	
	제한사항
	-10,000 ≤ numbers의 원소 ≤ 10,000
	1 ≤ numbers의 길이 ≤ 1,000
	입출력 예
	numbers	result
	[1, 2, 3, 4, 5]	[2, 4, 6, 8, 10]
	[1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
	입출력 예 설명
	입출력 예 #1
	
	[1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.
	입출력 예 #2
	
	[1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.
 */
package com.moon.main;

import java.util.Arrays;

public class Sol04 {
	 public int[] solution(int[] numbers) {
	        int[] result = new int[numbers.length]; // 결과 배열을 생성, 길이는 주어진 배열의 길이와 동일

	        for (int i = 0; i < numbers.length; i++) {
	            result[i] = numbers[i] * 2; // 각 원소에 두 배한 값을 결과 배열에 저장
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	    	Sol04 solution = new Sol04();
	        int[] numbers1 = {1, 2, 3, 4, 5};
	        int[] result1 = solution.solution(numbers1);
	        System.out.println(Arrays.toString(result1));

	        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};
	        int[] result2 = solution.solution(numbers2);
	        System.out.println(Arrays.toString(result2));
	    }
}
