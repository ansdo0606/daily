/**
 * 배열의 원소 삭제하기
	문제 설명
	정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 
	남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	1 ≤ arr의 길이 ≤ 100
	1 ≤ arr의 원소 ≤ 1,000
	arr의 원소는 모두 서로 다릅니다.
	1 ≤ delete_list의 길이 ≤ 100
	1 ≤ delete_list의 원소 ≤ 1,000
	delete_list의 원소는 모두 서로 다릅니다.
	입출력 예
	arr	delete_list	result
	[293, 1000, 395, 678, 94]	[94, 777, 104, 1000, 1, 12]	[293, 395, 678]
	[110, 66, 439, 785, 1]	[377, 823, 119, 43]	[110, 66, 439, 785, 1]
	입출력 예 설명
	입출력 예 #1
	
	예제 1번의 arr의 원소 중 1000과 94가 delete_list에 있으므로 이 두 원소를 삭제한 [293, 395, 678]을 
	return 합니다.
	입출력 예 #2
	
	예제 2번의 arr의 원소 중 delete_list에 있는 원소는 없습니다. 따라서 arr 그대로인 
	[110, 66, 439, 785, 1]을 return 합니다.
 */
package com.moon.main;

import java.util.ArrayList;
import java.util.List;

public class Sol04 {
	 public int[] solution(int[] arr, int[] delete_list) {
	        List<Integer> resultList = new ArrayList<>();

	        for (int num : arr) {
	            boolean shouldDelete = false;
	            for (int deleteNum : delete_list) {
	                if (num == deleteNum) {
	                    shouldDelete = true;
	                    break;
	                }
	            }
	            if (!shouldDelete) {
	                resultList.add(num);
	            }
	        }

	        // 리스트를 배열로 변환
	        int[] resultArray = new int[resultList.size()];
	        for (int i = 0; i < resultList.size(); i++) {
	            resultArray[i] = resultList.get(i);
	        }

	        return resultArray;
	    }

	    public static void main(String[] args) {
	    	Sol04 solution = new Sol04();
	        int[] arr1 = {293, 1000, 395, 678, 94};
	        int[] delete_list1 = {94, 777, 104, 1000, 1, 12};
	        int[] result1 = solution.solution(arr1, delete_list1);
	        for (int num : result1) {
	            System.out.print(num + " "); // 예상 출력: 293 395 678
	        }
	        System.out.println();

	        int[] arr2 = {110, 66, 439, 785, 1};
	        int[] delete_list2 = {377, 823, 119, 43};
	        int[] result2 = solution.solution(arr2, delete_list2);
	        for (int num : result2) {
	            System.out.print(num + " "); // 예상 출력: 110 66 439 785 1
	        }
	        System.out.println();
	    }
}
