/**
 * 정수를 나선형으로 배치하기
	문제 설명
	양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 
	나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	1 ≤ n ≤ 30
	입출력 예
	n	result
	4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
	5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], 
	[13, 12, 11, 10, 9]]
	입출력 예 설명
	입출력 예 #1
	
	예제 1번의 n의 값은 4로 4 × 4 배열에 다음과 같이 1부터 16까지 숫자를 채울 수 있습니다.
	
	행 \ 열	0	1	2	3
	0	1	2	3	4
	1	12	13	14	5
	2	11	16	15	6
	3	10	9	8	7
	따라서 [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]를 return 합니다.
	
	입출력 예 #2
	
	예제 2번의 n의 값은 5로 5 × 5 배열에 다음과 같이 1부터 25까지 숫자를 채울 수 있습니다.
	
	행 \ 열	0	1	2	3	4
	0	1	2	3	4	5
	1	16	17	18	19	6
	2	15	24	25	20	7
	3	14	23	22	21	8
	4	13	12	11	10	9
	따라서 [[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], 
	[13, 12, 11, 10, 9]]를 return 합니다.
 */
package com.moon.main;

public class Sol01 {
	 public int[][] solution(int n) {
	       int[][] matrix = new int[n][n];
	        int num = 1;
	        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;

	        while (rowStart <= rowEnd && colStart <= colEnd) {
	            // 위쪽 행
	            for (int i = colStart; i <= colEnd; i++) {
	                matrix[rowStart][i] = num++;
	            }
	            rowStart++;

	            // 오른쪽 열
	            for (int i = rowStart; i <= rowEnd; i++) {
	                matrix[i][colEnd] = num++;
	            }
	            colEnd--;

	            // 아래쪽 행
	            if (rowStart <= rowEnd) {
	                for (int i = colEnd; i >= colStart; i--) {
	                    matrix[rowEnd][i] = num++;
	                }
	                rowEnd--;
	            }

	            // 왼쪽 열
	            if (colStart <= colEnd) {
	                for (int i = rowEnd; i >= rowStart; i--) {
	                    matrix[i][colStart] = num++;
	                }
	                colStart++;
	            }
	        }

	        return matrix;
	    }
	 public static void main(String[] args) {
		 Sol01 solution = new Sol01();
	        int n1 = 4;
	        int n2 = 5;

	        int[][] result1 = solution.solution(n1);
	        int[][] result2 = solution.solution(n2);

	        // 결과 출력
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < n1; j++) {
	                System.out.print(result1[i][j] + " ");
	            }
	            System.out.println();
	        }

	        System.out.println();

	        for (int i = 0; i < n2; i++) {
	            for (int j = 0; j < n2; j++) {
	                System.out.print(result2[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
