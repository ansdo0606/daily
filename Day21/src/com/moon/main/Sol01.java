/**
 * 뒤에서 5등 위로
	문제 설명
	정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 
	오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	6 ≤ num_list의 길이 ≤ 30
	1 ≤ num_list의 원소 ≤ 100
	입출력 예
	num_list	result
	[12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]
	입출력 예 설명
	입출력 예 #1
	
	[12, 4, 15, 46, 38, 1, 14, 56, 32, 10]를 정렬하면 [1, 4, 10, 12, 14, 15, 32, 38, 46, 56]이 되고, 
	앞에서 부터 6번째 이후의 수들을 고르면 [15, 32, 38, 46, 56]가 됩니다.
 */
package com.moon.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol01 {
	public List<Integer> solution(int[] num_list) {
        // 정수 배열을 정렬합니다.
        Arrays.sort(num_list);

        // 결과를 담을 리스트를 생성합니다.
        List<Integer> result = new ArrayList<>();

        // 가장 작은 5개의 수를 제외한 나머지 수를 결과 리스트에 추가합니다.
        for (int i = 5; i < num_list.length; i++) {
            result.add(num_list[i]);
        }

        return result;
    }
	public static void main(String[] args) {
		Sol01 solution = new Sol01();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        List<Integer> result = solution.solution(num_list);

        // 결과를 출력합니다.
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
