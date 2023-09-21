/**
 * 배열 자르기
	문제 설명
	정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 
	인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	2 ≤ numbers의 길이 ≤ 30
	0 ≤ numbers의 원소 ≤ 1,000
	0 ≤num1 < num2 < numbers의 길이
	입출력 예
	numbers				num1		num2		result
	[1, 2, 3, 4, 5]		1			3			[2, 3, 4]
	[1, 3, 5]			1			2			[3, 5]
	입출력 예 설명
	입출력 예 #1
	
	[1, 2, 3, 4, 5]의 1번째 인덱스 2부터 3번째 인덱스 4 까지 자른 [2, 3, 4]를 return 합니다.
	입출력 예 #2
	
	[1, 3, 5]의 1번째 인덱스 3부터 2번째 인덱스 5까지 자른 [3, 5]를 return 합니다.
 */
package com.moon.main;

public class Sol01 {
	public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1, j = 0; i <= num2; i++, j++) {
            answer[j] = numbers[i];
        }
        return answer;
    }
	public static void main(String[] args) {
		Sol01 solution = new Sol01();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int num1_1 = 1;
        int num2_1 = 3;
        int[] result1 = solution.solution(numbers1, num1_1, num2_1);
        System.out.print("[");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] numbers2 = {1, 3, 5};
        int num1_2 = 1;
        int num2_2 = 2;
        int[] result2 = solution.solution(numbers2, num1_2, num2_2);
        System.out.print("[");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
