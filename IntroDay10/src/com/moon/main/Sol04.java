/**
 * 배열 회전시키기
	문제 설명
	정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 
	direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	3 ≤ numbers의 길이 ≤ 20
	direction은 "left" 와 "right" 둘 중 하나입니다.
	입출력 예
	numbers	direction	result
	[1, 2, 3]	"right"	[3, 1, 2]
	[4, 455, 6, 4, -1, 45, 6]	"left"	[455, 6, 4, -1, 45, 6, 4]
	입출력 예 설명
	입출력 예 #1
	
	numbers 가 [1, 2, 3]이고 direction이 "right" 이므로 오른쪽으로 한 칸씩 회전시킨 [3, 1, 2]를 return합니다.
	입출력 예 #2
	
	numbers 가 [4, 455, 6, 4, -1, 45, 6]이고 direction이 "left" 이므로 왼쪽으로 한 칸씩 회전시킨 
	[455, 6, 4, -1, 45, 6, 4]를 return합니다.
 */
package com.moon.main;

public class Sol04 {
	public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] result = new int[n];

        if ("right".equals(direction)) {
            for (int i = 0; i < n; i++) {
                result[(i + 1) % n] = numbers[i];
            }
        } else if ("left".equals(direction)) {
            for (int i = 0; i < n; i++) {
                result[i] = numbers[(i + 1) % n];
            }
        }

        return result;
    }

    public static void main(String[] args) {
    	Sol04 solution = new Sol04();

        int[] numbers1 = {1, 2, 3};
        String direction1 = "right";
        int[] result1 = solution.solution(numbers1, direction1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        // 출력 결과: 3 1 2

        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};
        String direction2 = "left";
        int[] result2 = solution.solution(numbers2, direction2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        // 출력 결과: 455 6 4 -1 45 6 4
    }
}
