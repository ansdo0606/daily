/**
 * 배열 비교하기
	문제 설명
	이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
	
	두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
	배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
	두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, 
	arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	1 ≤ arr1의 길이 ≤ 100
	1 ≤ arr2의 길이 ≤ 100
	1 ≤ arr1의 원소 ≤ 100
	1 ≤ arr2의 원소 ≤ 100
	문제에서 정의한 배열의 대소관계가 일반적인 프로그래밍 언어에서 정의된 배열의 대소관계와 
	다를 수 있는 점에 유의해주세요.
	입출력 예
	arr1	arr2	result
	[49, 13]	[70, 11, 2]	-1
	[100, 17, 84, 1]	[55, 12, 65, 36]	1
	[1, 2, 3, 4, 5]	[3, 3, 3, 3, 3]	0
	입출력 예 설명
	입출력 예 #1
	
	예제 1번에서는 arr1의 길이는 2이고 arr2의 길이는 3으로 arr2의 길이가 더 깁니다. 따라서 arr2가 
	arr1보다 크므로 -1을 return 합니다.
	입출력 예 #2
	
	예제 2번에서는 arr1의 길이과 arr2의 길이가 4로 같습니다. arr1의 모든 원소의 합은 
	100 + 17 + 84 + 1 = 202이고 arr2의 모든 원소의 합은 55 + 12 + 65 + 36 = 168으로 arr1의 
	모든 원소의 합이 더 큽니다. 따라서 arr1이 arr2보다 크므로 1을 return 합니다.
	입출력 예 #3
	
	예제 3번에서는 arr1의 길이와 arr2의 길이가 5로 같고 각 배열의 모든 원소의 합 또한 15로 같습니다. 
	따라서 arr1과 arr2가 같으므로 0을 return 합니다.
 */
package com.moon.main;

public class Sol02 {
	 public static int solution(int[] arr1, int[] arr2) {
	        int sum1 = 0;
	        int sum2 = 0;

	        for (int num : arr1) {
	            sum1 += num;
	        }

	        for (int num : arr2) {
	            sum2 += num;
	        }

	        if (arr1.length < arr2.length || (arr1.length == arr2.length && sum1 < sum2)) {
	            return -1;
	        } else if (arr1.length > arr2.length || (arr1.length == arr2.length && sum1 > sum2)) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
	 public static void main(String[] args) {
	        int[] arr1 = {49, 13};
	        int[] arr2 = {70, 11, 2};
	        int[] arr3 = {100, 17, 84, 1};
	        int[] arr4 = {55, 12, 65, 36};
	        int[] arr5 = {1, 2, 3, 4, 5};
	        int[] arr6 = {3, 3, 3, 3, 3};

	        int result1 = solution(arr1, arr2);
	        int result2 = solution(arr3, arr4);
	        int result3 = solution(arr5, arr6);

	        System.out.println(result1); // -1
	        System.out.println(result2); // 1
	        System.out.println(result3); // 0
	    }
}
