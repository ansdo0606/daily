/**
 * 배열 뒤집기
	문제 설명
	정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 
	배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ num_list의 길이 ≤ 1,000
	0 ≤ num_list의 원소 ≤ 1,000
	입출력 예
	num_list	result
	[1, 2, 3, 4, 5]	[5, 4, 3, 2, 1]
	[1, 1, 1, 1, 1, 2]	[2, 1, 1, 1, 1, 1]
	[1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
	입출력 예 설명
	입출력 예 #1
	
	num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.
	입출력 예 #2
	
	num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.
	입출력 예 #3
	
	num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.
 */
package com.moon.main;

import java.util.Arrays;

public class Sol04 {
	 public int[] solution(int[] num_list) {
	        int[] reversedArray = new int[num_list.length];
	        
	        for (int i = 0; i < num_list.length; i++) {
	            reversedArray[i] = num_list[num_list.length - 1 - i];
	        }
	        
	        return reversedArray;
	    }

	    public static void main(String[] args) {
	    	Sol04 solution = new Sol04();
	        int[] num_list1 = {1, 2, 3, 4, 5};
	        int[] num_list2 = {1, 1, 1, 1, 1, 2};
	        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};

	        int[] result1 = solution.solution(num_list1);
	        int[] result2 = solution.solution(num_list2);
	        int[] result3 = solution.solution(num_list3);

	        System.out.println(Arrays.toString(result1)); // [5, 4, 3, 2, 1] 출력
	        System.out.println(Arrays.toString(result2)); // [2, 1, 1, 1, 1, 1] 출력
	        System.out.println(Arrays.toString(result3)); // [5, 3, 1, 1, 1, 0, 1] 출력
	    }
}
