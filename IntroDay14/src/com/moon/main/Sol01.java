/**
 * 가까운 수
	문제 설명
	정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 
	return 하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ array의 길이 ≤ 100
	1 ≤ array의 원소 ≤ 100
	1 ≤ n ≤ 100
	가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
	입출력 예
	array	n	result
	[3, 10, 28]	20	28
	[10, 11, 12]	13	12
	입출력 예 설명
	입출력 예 #1
	
	3, 10, 28 중 20과 가장 가까운 수는 28입니다.
	입출력 예 #2
	
	10, 11, 12 중 13과 가장 가까운 수는 12입니다.
 */
package com.moon.main;

public class Sol01 {
	 public static int solution(int[] array, int n) {
	        int closest = array[0];
	        int minDiff = Math.abs(n - closest);

	        for (int i = 1; i < array.length; i++) {
	            int diff = Math.abs(n - array[i]);
	            if (diff < minDiff || (diff == minDiff && array[i] < closest)) {
	                closest = array[i];
	                minDiff = diff;
	            }
	        }

	        return closest;
	    }

	    public static void main(String[] args) {

	        int[] array1 = {3, 10, 28};
	        int n1 = 20;
	        int result1 = solution(array1, n1);
	        System.out.println(result1); // 예상 결과: 28

	        int[] array2 = {10, 11, 12};
	        int n2 = 13;
	        int result2 = solution(array2, n2);
	        System.out.println(result2); // 예상 결과: 12
	    }
}
