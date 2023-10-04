/**
 *약수 구하기
	문제 설명
	정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ n ≤ 10,000
	입출력 예
	n	result
	24	[1, 2, 3, 4, 6, 8, 12, 24]
	29	[1, 29]
	입출력 예 설명
	입출력 예 #1
	
	24의 약수를 오름차순으로 담은 배열 [1, 2, 3, 4, 6, 8, 12, 24]를 return합니다.
	입출력 예 #2
	
	29의 약수를 오름차순으로 담은 배열 [1, 29]를 return합니다. 
 */
package com.moon.main;

import java.util.*;

public class Sol04 {
	public static int[] solution(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        // List를 배열로 변환
        int[] result = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int n1 = 24;
        int[] result1 = solution(n1);
        System.out.println(java.util.Arrays.toString(result1)); // 예상 결과: [1, 2, 3, 4, 6, 8, 12, 24]

        int n2 = 29;
        int[] result2 = solution(n2);
        System.out.println(java.util.Arrays.toString(result2)); // 예상 결과: [1, 29]
    }
}
