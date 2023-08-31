/**
 * 카운트 다운
	문제 설명
	정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	0 ≤ end_num ≤ start_num ≤ 50
	입출력 예
	start_num	end_num	result
	10	3	[10, 9, 8, 7, 6, 5, 4, 3]
	입출력 예 설명
	입출력 예 #1
	
	10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.
 */
package com.moon.main;

import java.util.ArrayList;
import java.util.List;

public class Sol04 {
	public List<Integer> solution(int start_num, int end_num) {
        List<Integer> result = new ArrayList<>();
        
        for (int num = start_num; num >= end_num; num--) {
            result.add(num);
        }
        
        return result;
    }

    public static void main(String[] args) {
    	Sol04 solution = new Sol04();
        int start_num = 10;
        int end_num = 3;
        List<Integer> result = solution.solution(start_num, end_num);
        System.out.println(result); // [10, 9, 8, 7, 6, 5, 4, 3]
    }
}
