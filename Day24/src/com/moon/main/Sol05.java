/**
 * 특별한 이차원 배열 1
	문제 설명
	정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 
	함수를 작성해 주세요.
	
	arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
	제한사항
	1 ≤ n ≤ 100
	입출력 예
	n	result
	3	[[1, 0, 0], [0, 1, 0], [0, 0, 1]]
	6	[[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], 
	[0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]
	1	[[1]]
	입출력 예 설명
	입출력 예 #1
	
	예제 1번의 n의 값은 3으로 다음과 같이 2차원 배열을 채울 수 있습니다.
	
	i \ j	0	1	2
	0	1	0	0
	1	0	1	0
	2	0	0	1
	따라서 [[1, 0, 0], [0, 1, 0], [0, 0, 1]]을 return 합니다.
	
	입출력 예 #2
	
	예제 2번의 n의 값은 6으로 다음과 같이 2차원 배열을 채울 수 있습니다.
	
	i \ j	0	1	2	3	4	5
	0	1	0	0	0	0	0
	1	0	1	0	0	0	0
	2	0	0	1	0	0	0
	3	0	0	0	1	0	0
	4	0	0	0	0	1	0
	5	0	0	0	0	0	1
	따라서 [[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], 
	[0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]을 return 합니다.
	
	입출력 예 #3
	
	예제 1번의 n의 값은 1이고 다음과 같이 2차원 배열을 채울 수 있습니다.
	
	i \ j	0
	0	1
	따라서 [[1]]을 return 합니다.
 */
package com.moon.main;

public class Sol05 {
	 public int[][] solution(int n) {
	        int[][] arr = new int[n][n];

	        for (int i = 0; i < n; i++) {
	            arr[i][i] = 1;
	        }

	        return arr;
	    }

	    public static void main(String[] args) {
	    	Sol05 solution = new Sol05();
	        int n1 = 3;
	        int[][] result1 = solution.solution(n1);
	        printArray(result1);

	        int n2 = 6;
	        int[][] result2 = solution.solution(n2);
	        printArray(result2);

	        int n3 = 1;
	        int[][] result3 = solution.solution(n3);
	        printArray(result3);
	    }

	    // 배열 출력 함수
	    public static void printArray(int[][] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
}
