/**
 * 
 */
package com.moon.main;

import java.util.Arrays;

public class Sol04 {
	public static class Solution {
	    // 최대공약수를 구하는 함수
	    private int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }

	    public int solution(int a, int b) {
	        // 분자와 분모의 최대공약수를 구합니다.
	        int greatestCommonDivisor = gcd(a, b);

	        // 분자와 분모를 최대공약수로 나눠 기약분수로 만듭니다.
	        int simplifiedA = a / greatestCommonDivisor;
	        int simplifiedB = b / greatestCommonDivisor;

	        // 분모의 소인수가 2와 5로만 구성되어 있는지 확인합니다.
	        while (simplifiedB % 2 == 0) {
	            simplifiedB /= 2;
	        }

	        while (simplifiedB % 5 == 0) {
	            simplifiedB /= 5;
	        }

	        // 분모가 1이면 유한소수, 그렇지 않으면 무한소수입니다.
	        if (simplifiedB == 1) {
	            return 1;
	        } else {
	            return 2;
	        }
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int a1 = 7;
	        int b1 = 20;
	        int result1 = solution.solution(a1, b1);
	        System.out.println(result1);

	        int a2 = 11;
	        int b2 = 22;
	        int result2 = solution.solution(a2, b2);
	        System.out.println(result2);

	        int a3 = 12;
	        int b3 = 21;
	        int result3 = solution.solution(a3, b3);
	        System.out.println(result3);
	    }
	}

	
}
