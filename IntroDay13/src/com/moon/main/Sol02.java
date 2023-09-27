/**
 * 배열 원소의 길이
	문제 설명
	문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 
	solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ strlist 원소의 길이 ≤ 100
	strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
	입출력 예
	strlist	result
	["We", "are", "the", "world!"]	[2, 3, 3, 6]
	["I", "Love", "Programmers."]	[1, 4, 12]
	입출력 예 설명
	입출력 예 #1
	
	["We", "are", "the", "world!"]의 각 원소의 길이인 [2, 3, 3, 6]을 return합니다.
	입출력 예 #2
	
	["I", "Love", "Programmers."]의 각 원소의 길이인 [1, 4, 12]을 return합니다.
 */
package com.moon.main;

public class Sol02 {
	public static int[] solution(String[] strlist) {
        int[] result = new int[strlist.length]; // 결과를 저장할 배열 생성

        for (int i = 0; i < strlist.length; i++) {
            result[i] = strlist[i].length(); // 각 원소의 길이를 배열에 저장
        }

        return result;
    }

    public static void main(String[] args) {

        // 테스트 케이스 1
        String[] input1 = { "We", "are", "the", "world!" };
        int[] result1 =solution(input1);
        printArray(result1);

        // 테스트 케이스 2
        String[] input2 = { "I", "Love", "Programmers." };
        int[] result2 = solution(input2);
        printArray(result2);
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
