/**
 * 첫 번째로 나오는 음수
	문제 설명
	정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 
	return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
	
	제한사항
	5 ≤ num_list의 길이 ≤ 100
	-10 ≤ num_list의 원소 ≤ 100
	입출력 예
	num_list	result
	[12, 4, 15, 46, 38, -2, 15]	5
	[13, 22, 53, 24, 15, 6]	-1
	입출력 예 설명
	입출력 예 #1
	
	5번 인덱스에서 음수가 처음 등장하므로 5를 return합니다.
	입출력 예 #2
	
	음수가 없으므로 -1을 return합니다.
 */
package com.moon.main;

public class Sol02 {
	 public static int solution(int[] num_list) {
	        for (int i = 0; i < num_list.length; i++) {
	            if (num_list[i] < 0) {
	                return i;
	            }
	        }
	        return -1; // 음수가 없는 경우
	    }

	    public static void main(String[] args) {
	        int[] num_list1 = {12, 4, 15, 46, 38, -2, 15};
	        int result1 = solution(num_list1);
	        System.out.println(result1);  // 5

	        int[] num_list2 = {13, 22, 53, 24, 15, 6};
	        int result2 = solution(num_list2);
	        System.out.println(result2);  // -1
	    }
}
