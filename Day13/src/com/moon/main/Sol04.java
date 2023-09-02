/**
 * n 번째 원소까지
	문제 설명
	정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 
	모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	2 ≤ num_list의 길이 ≤ 30
	1 ≤ num_list의 원소 ≤ 9
	1 ≤ n ≤ num_list의 길이 ___
	입출력 예
	num_list	n	result
	[2, 1, 6]	1	[2]
	[5, 2, 1, 7, 5]	3	[5, 2, 1]
	입출력 예 설명
	입출력 예 #1
	
	[2, 1, 6]의 첫 번째 원소부터 첫 번째 원소까지의 모든 원소는 [2]입니다.
	입출력 예 #2
	
	[5, 2, 1, 7, 5]의 첫 번째 원소부터 세 번째 원소까지의 모든 원소는 [5, 2, 1]입니다.
 */
package com.moon.main;

import java.util.ArrayList;
import java.util.List;

public class Sol04 {
	  public List<Integer> solution(int[] num_list, int n) {
	        List<Integer> result = new ArrayList<>();
	        
	        for (int i = 0; i < n; i++) {
	            result.add(num_list[i]);
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	    	Sol04 solution = new Sol04();
	        
	        int[] num_list1 = {2, 1, 6};
	        int n1 = 1;
	        List<Integer> result1 = solution.solution(num_list1, n1);
	        System.out.println(result1); // [2]
	        
	        int[] num_list2 = {5, 2, 1, 7, 5};
	        int n2 = 3;
	        List<Integer> result2 = solution.solution(num_list2, n2);
	        System.out.println(result2); // [5, 2, 1]
	    }
}
