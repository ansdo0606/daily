/**
 * 소인수분해
	문제 설명
	소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 
	나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 
	담은 배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	2 ≤ n ≤ 10,000
	입출력 예
	n		result
	12		[2, 3]
	17		[17]
	420		[2, 3, 5, 7]
	입출력 예 설명
	입출력 예 #1
	
	12를 소인수분해하면 2 * 2 * 3 입니다. 따라서 [2, 3]을 return합니다.
	입출력 예 #2
	
	17은 소수입니다. 따라서 [17]을 return 해야 합니다.
	입출력 예 #3
	
	420을 소인수분해하면 2 * 2 * 3 * 5 * 7 입니다. 따라서 [2, 3, 5, 7]을 return합니다.
 */
package com.moon.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sol04 {
	 public static int[] solution(int n) {
	        Set<Integer> set = new HashSet<>();
	        
	        for (int i = 2; i <= n; i++) {
	            while (n % i == 0) {
	                set.add(i);
	                n /= i;
	            }
	        }
	        
	        int[] answer = new int[set.size()];
	        Iterator<Integer> it = set.iterator();
	        int i = 0;
	        
	        while (it.hasNext()) {
	            answer[i] = it.next();
	            i++;
	        }
	        
	        // 오름차순으로 정렬
	        Arrays.sort(answer);
	        
	        return answer;
	    }
	 public static void main(String[] args) {
	        // 테스트 케이스 예시
	        int input1 = 12;
	        int input2 = 17;
	        int input3 = 420;

	        int[] output1 = solution(input1);
	        int[] output2 = solution(input2);
	        int[] output3 = solution(input3);

	        // 결과 출력
	        printArray(output1); // [2, 3]
	        printArray(output2); // [17]
	        printArray(output3); // [2, 2, 3, 5, 7]
	    }

	    // 배열 출력을 위한 유틸리티 함수
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
}
