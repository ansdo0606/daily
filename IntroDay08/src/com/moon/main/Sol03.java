/**
 * 진료 순서 정하기
	문제 설명
	외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
	정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 
	return하도록 solution 함수를 완성해주세요.
	
	제한사항
	중복된 원소는 없습니다.
	1 ≤ emergency의 길이 ≤ 10
	1 ≤ emergency의 원소 ≤ 100
	입출력 예
	emergency	result
	[3, 76, 24]	[3, 1, 2]
	[1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
	[30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
	입출력 예 설명
	입출력 예 #1
	
	emergency가 [3, 76, 24]이므로 응급도의 크기 순서대로 번호를 매긴 [3, 1, 2]를 return합니다.
	입출력 예 #2
	
	emergency가 [1, 2, 3, 4, 5, 6, 7]이므로 응급도의 크기 순서대로 번호를 매긴 [7, 6, 5, 4, 3, 2, 1]를 
	return합니다.
	입출력 예 #3
	
	emergency가 [30, 10, 23, 6, 100]이므로 응급도의 크기 순서대로 번호를 매긴 [2, 4, 3, 5, 1]를 return합니다.
 */
package com.moon.main;

import java.util.Arrays;

public class Sol03 {
	 public int[] solution(int[] emergency) {
	        int[] answer = new int[emergency.length];
	        
	        Integer[] indices = new Integer[emergency.length];
	        for (int i = 0; i < emergency.length; i++) {
	            indices[i] = i;
	        }
	        
	        Arrays.sort(indices, (i1, i2) -> {
	            if (emergency[i1] != emergency[i2]) {
	                return Integer.compare(emergency[i2], emergency[i1]);
	            } else {
	                return Integer.compare(i1, i2); // 응급도가 같을 경우 인덱스 오름차순 정렬
	            }
	        });
	        
	        for (int i = 0; i < emergency.length; i++) {
	            answer[indices[i]] = i + 1;
	        }
	        
	        return answer;
	    }
	 public static void main(String[] args) {
		 Sol03 solution = new Sol03();
	        
	        int[] emergency1 = {3, 76, 24};
	        int[] result1 = solution.solution(emergency1);
	        System.out.println(Arrays.toString(result1)); // [3, 1, 2]
	        
	        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
	        int[] result2 = solution.solution(emergency2);
	        System.out.println(Arrays.toString(result2)); // [7, 6, 5, 4, 3, 2, 1]
	        
	        int[] emergency3 = {30, 10, 23, 6, 100};
	        int[] result3 = solution.solution(emergency3);
	        System.out.println(Arrays.toString(result3)); // [5, 3, 4, 1, 2]
	    }
}
