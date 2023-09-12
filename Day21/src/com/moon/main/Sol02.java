/**
 * 전국 대회 선발 고사
	문제 설명
	0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 
	등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 
	참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
	
	각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 
	배열 attendance가 매개변수로 주어집니다. 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 
	각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	3 ≤ rank의 길이 = attendance의 길이 ≤ 100
	rank[i]는 i번 학생의 선발 고사 등수를 의미합니다.
	rank의 원소는 1부터 n까지의 정수로 모두 서로 다릅니다.
	attendance[i]는 i번 학생의 전국 대회 참석 가능 여부를 나타냅니다.
	attendance[i]가 true라면 참석 가능, false면 참석 불가능을 의미합니다.
	attendance의 원소 중 적어도 3개는 true입니다.
	입출력 예
	rank	attendance	result
	[3, 7, 2, 5, 4, 6, 1]	[false, true, true, true, true, false, false]	20403
	[1, 2, 3]	[true, true, true]	102
	[6, 1, 5, 2, 3, 4]	[true, false, true, false, false, true]	50200
	입출력 예 설명
	입출력 예 #1
	
	예제 1번에서 1등은 6번 학생이지만 전국 대회에 참석 불가능하므로 넘어갑니다. 2등은 2번 학생이고 
	전국 대회에 참석 가능하므로 1순위로 선발됩니다. 3등은 0번 학생이고 전국 대회에 참석 불가능 하므로 넘어갑니다. 
	4등과 5등은 각각 4번, 3번 학생이고 두 학생 모두 전국 대회에 참석 가능하므로 각각 2순위, 3순위로 선발됩니다. 
	3명을 선발하였으므로 6등과 7등은 확인하지 않아도 됩니다. 따라서 10000 × 2 + 100 × 4 + 3 = 20403을 
	return 합니다.
	입출력 예 #2
	
	예제 2번에서 1, 2, 3등은 각각 0번, 1번, 2번 학생이고 세 학생 모두 전국 대회에 참석 가능하므로 
	각각 1순위, 2순위, 3순위로 선발됩니다. 따라서 10000 × 0 + 100 × 1 + 2 = 102를 return 합니다.
	입출력 예 #3
	
	예제 3번에서 1, 2, 3등은 각각 1번, 3번, 4번 학생이지만 세 학생 모두 전국 대회에 참석 불가능합니다. 
	다음으로 4, 5, 6등은 각각 5번, 2번, 0번 학생이고 세 학생 모두 전국 대회에 참석 가능하므로 
	각각 1순위, 2순위, 3순위로 선발됩니다. 따라서 10000 × 5 + 100 × 2 + 0 = 50200을 return 합니다.
 */

/**
 * TreeMap은 Java의 컬렉션 중 하나로, 정렬된 키(key)를 기반으로 데이터를 저장하고 관리하는 자료구조
 * 이를 사용하면 데이터를 키의 자연 순서 또는 정의한 순서대로 유지할 수 있다.

	1. 정렬된 데이터 저장: 키(key)를 정렬된 순서로 저장/기본적으로 키의 자연 순서(오름차순)에 따라 정렬
		/커스텀한 정렬 기준을 제공

	2. 중복 키 처리: 중복 키 허용 X /동일한 키가 이미 존재하는 경우, 새로운 값으로 기존 키를 대체

	3. 빠른 검색 및 탐색: 이진 검색 트리(Binary Search Tree)로 구현되어 있어 데이터를 검색하거나 
		범위로 데이터를 조회하는 작업에서 빠르게 수행

	4. 키의 정렬 순서 사용: 키의 정렬 순서를 활용하여 작은 값부터 큰 값 순서로 데이터에 접근 O

	5. NavigableMap 인터페이스 구현: 다양한 탐색, 조회 메서드 제공

	TreeMap의 주요 메서드에는 put(key, value), get(key), remove(key), size(), isEmpty(), 
	firstKey(), lastKey(), headMap(toKey), tailMap(fromKey), subMap(fromKey, toKey) 등이 있습니다.
 */
package com.moon.main;

import java.util.*;

public class Sol02 {
	    public int solution(int[] rank, boolean[] attendance) {
	        TreeMap<Integer, Integer> map = new TreeMap<>();

	        for (int i = 0; i < rank.length; i++) {
	            if (attendance[i]) {
	                map.put(rank[i], i);
	            }
	        }

	        int[] answer = map.values().stream().mapToInt(Integer::intValue).toArray();
	        return answer[0] * 10000 + answer[1] * 100 + answer[2];
	    }
	 public static void main(String[] args) {
		 Sol02 solution = new Sol02();
	        
	        int[] rank1 = {3, 7, 2, 5, 4, 6, 1};
	        boolean[] attendance1 = {false, true, true, true, true, false, false};
	        int result1 = solution.solution(rank1, attendance1);
	        System.out.println(result1); // 예상 출력: 20403

	        int[] rank2 = {1, 2, 3};
	        boolean[] attendance2 = {true, true, true};
	        int result2 = solution.solution(rank2, attendance2);
	        System.out.println(result2); // 예상 출력: 102

	        int[] rank3 = {6, 1, 5, 2, 3, 4};
	        boolean[] attendance3 = {true, false, true, false, false, true};
	        int result3 = solution.solution(rank3, attendance3);
	        System.out.println(result3); // 예상 출력: 50200
	    }
}
