/**
 * 5명씩
	문제 설명
	최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 
	앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 
	완성해주세요. 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
	
	제한사항
	5 ≤ names의 길이 ≤ 30
	1 ≤ names의 원소의 길이 ≤ 10
	names의 원소는 영어 알파벳 소문자로만 이루어져 있습니다.
	입출력 예
	names															result
	["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]		["nami", "vex"]
	입출력 예 설명
	입출력 예 #1
	
	앞에서부터 5명씩 두 그룹으로 묶을 수 있습니다. ["nami", "ahri", "jayce", "garen", "ivern"], 
	["vex", "jinx"] 이 두 그룹에서 가장 앞에 서있는 사람들의 이름을 담은 리스트인 ["nami", "vex"]를 return합니다.
 */
package com.moon.main;

import java.util.ArrayList;
import java.util.List;

public class Sol02 {
	 public List<String> solution(String[] names) {
	        List<String> result = new ArrayList<>();
	        int groupSize = 5; // 그룹 크기를 5로 설정
	        int currentIndex = 0; // 현재 인덱스

	        while (currentIndex < names.length) {
	            List<String> group = new ArrayList<>();
	            
	            // 현재 그룹에 사람들을 추가
	            for (int i = 0; i < groupSize && currentIndex < names.length; i++) {
	                group.add(names[currentIndex]);
	                currentIndex++;
	            }
	            
	            // 현재 그룹의 첫 번째 사람을 결과 리스트에 추가
	            if (!group.isEmpty()) {
	                result.add(group.get(0));
	            }
	        }
	        
	        return result;
	    }

	    public static void main(String[] args) {
	    	Sol02 solution = new Sol02();

	        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

	        List<String> result = solution.solution(names);

	        System.out.println(result); // 출력 예상 결과: ["nami", "vex"]
	    }
}
