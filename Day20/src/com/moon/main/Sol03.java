/**
 * 문자열 묶기
	문제 설명
	문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 
	가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
	
	제한사항
	1 ≤ strArr의 길이 ≤ 100,000
	1 ≤ strArr의 원소의 길이 ≤ 30
	strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
	입출력 예
	strArr	result
	["a","bc","d","efg","hi"]	2
	입출력 예 설명
	입출력 예 #1
	
	각 문자열들을 길이에 맞게 그룹으로 묶으면 다음과 같습니다.
	문자열 길이	문자열 목록	개수
	1	["a","d"]	2
	2	["bc","hi"]	2
	3	["efg"]	1
	개수의 최댓값은 2이므로 2를 return 합니다.
 */
package com.moon.main;

import java.util.HashMap;
import java.util.Map;

public class Sol03 {
	public static int solution(String[] strArr) {
        Map<Integer, Integer> lengthToCount = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            lengthToCount.put(length, lengthToCount.getOrDefault(length, 0) + 1);
        }

        int maxCount = 0;

        for (int count : lengthToCount.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }
	 public static void main(String[] args) {
	        String[] strArr = {"a", "bc", "d", "efg", "hi"};
	        int result = solution(strArr);
	        System.out.println(result); // 2
	    }
}
