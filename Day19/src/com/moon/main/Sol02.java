/**
 * 배열의 원소만큼 추가하기
	문제 설명
	아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, 
	arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 
	배열 X를 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	1 ≤ arr의 길이 ≤ 100
	1 ≤ arr의 원소 ≤ 100
	입출력 예
	arr	result
	[5, 1, 4]	[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
	[6, 6]	[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
	[1]	[1]
	입출력 예 설명
	입출력 예 #1
	
	예제 1번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.
	
	a	X
	[]
	5	[5, 5, 5, 5, 5]
	1	[5, 5, 5, 5, 5, 1]
	4	[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
	따라서 [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]를 return 합니다.
	
	입출력 예 #2
	
	예제 2번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.
	
	a	X
	[]
	6	[6, 6, 6, 6, 6, 6]
	6	[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
	따라서 [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]를 return 합니다.
	
	입출력 예 #3
	
	예제 2번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.
	
	a	X
	[]
	1	[1]
	따라서 [1]을 return 합니다.
 */
package com.moon.main;

import java.util.ArrayList;
import java.util.List;

public class Sol02 {
	 public static int[] solution(int[] arr) {
	        List<Integer> resultList = new ArrayList<>();

	        for (int num : arr) {
	            for (int i = 0; i < num; i++) {
	                resultList.add(num);
	            }
	        }

	        // List를 배열로 변환
	        int[] resultArray = new int[resultList.size()];
	        for (int i = 0; i < resultList.size(); i++) {
	            resultArray[i] = resultList.get(i);
	        }

	        return resultArray;
	    }

	    public static void printArray(int[] arr) {
	        System.out.print("[");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	    public static void main(String[] args) {
	        int[] arr1 = {5, 1, 4};
	        int[] arr2 = {6, 6};
	        int[] arr3 = {1};

	        int[] result1 = solution(arr1);
	        int[] result2 = solution(arr2);
	        int[] result3 = solution(arr3);

	        printArray(result1); // [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
	        printArray(result2); // [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
	        printArray(result3); // [1]
	    }
}
