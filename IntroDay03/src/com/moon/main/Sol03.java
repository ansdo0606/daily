/**
 * 최빈값 구하기
	문제 설명
	최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 
	최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
	
	제한사항
	0 < array의 길이 < 100
	0 ≤ array의 원소 < 1000
	입출력 예
	array	result
	[1, 2, 3, 3, 3, 4]	3
	[1, 1, 2, 2]	-1
	[1]	1
	입출력 예 설명
	입출력 예 #1
	
	[1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
	입출력 예 #2
	
	[1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
	입출력 예 #3
	
	[1]에는 1만 있으므로 최빈값은 1입니다.
 */
package com.moon.main;

import java.util.HashMap;
import java.util.Map;
//내가 쓴 식
public class Sol03 {
	public static int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // 배열을 순회하면서 각 원소가 나온 횟수를 센다.
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mode = -1;

        // 가장 많이 나온 값을 찾는다.
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mode = num;
            } else if (count == maxCount) {
                // 최빈값이 여러 개인 경우 -1 반환
                mode = -1;
            }
        }

        return mode;
    }
	public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 3, 3, 4};
        int result1 = solution(array1);
        System.out.println(result1); // 3 출력

        int[] array2 = {1, 1, 2, 2};
        int result2 = solution(array2);
        System.out.println(result2); // -1 출력

        int[] array3 = {1};
        int result3 = solution(array3);
        System.out.println(result3); // 1 출력
    }
}

//남이 쓴 식
//import java.util.*;
//class Solution {
//    public int solution(int[] array) {
//        int maxCount = 0;
//        int answer = 0;
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        /* getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
//         getPrDefault(Object key, V DefaultValue)
//         매개변수 : 이 메서드는 두개의 매개변수를 허용
//         key : 값을 가져와야 하는 요소의 키
//         defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
//         반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환*/
//
//        for(int number : array) {
//            int count = map.getOrDefault(number, 0) + 1;
//
//            if(count > maxCount) {
//                maxCount = count;
//                answer = number;
//            }
//
//            else if(count == maxCount) {
//                answer = -1;
//            }
//
//            map.put(number, count);
//        }
//
//        return answer;
//    }
//}