/**
 * 정사각형으로 만들기
	문제 설명
	이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 
	각 행의 끝에 0을 추가하고, 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 
	이차원 배열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항
	1 ≤ arr의 길이 ≤ 100
	1 ≤ arr의 원소의 길이 ≤ 100
	arr의 모든 원소의 길이는 같습니다.
	1 ≤ arr의 원소의 원소 ≤ 1,000
	입출력 예
	arr	
	[[572, 22, 37], [287, 726, 384], [85, 137, 292], [487, 13, 876]]	
	result
	[[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]
	
	arr	
	[[57, 192, 534, 2], [9, 345, 192, 999]]	
	result
	[[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]
	
	arr	
	[[1, 2], [3, 4]]	
	result
	[[1, 2], [3, 4]]
	입출력 예 설명
	입출력 예 #1
	
	예제 1번의 arr은 행의 수가 4, 열의 수가 3입니다. 행의 수가 더 많으므로 열의 수를 4로 만들기 위해 
	arr의 각 행의 끝에 0을 추가한 이차원 배열 [[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], 
	[487, 13, 876, 0]]를 return 합니다.
	입출력 예 #2
	
	예제 2번의 arr은 행의 수가 2, 열의 수가 4입니다. 열의 수가 더 많으므로 행의 수를 4로 만들기 위해 
	arr의 각 열의 끝에 0을 추가한 이차원 배열 [[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], 
	[0, 0, 0, 0]]을 return 합니다.
	입출력 예 #3
	
	예제 3번의 arr은 행의 수와 열의 수가 2로 같습니다. 따라서 0을 추가하지 않고 [[1, 2], [3, 4]]을 return 합니다.
 */
package com.moon.main;

public class Sol03 {
	public int[][] solution(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;

        // 행의 수가 더 많으면 열의 수를 행의 수와 동일하게 만들기 위해 0을 추가
        if (numRows > numCols) {
            for (int i = 0; i < numRows; i++) {
                while (arr[i].length < numRows) {
                    int[] newRow = new int[numRows];
                    System.arraycopy(arr[i], 0, newRow, 0, arr[i].length);
                    arr[i] = newRow;
                }
            }
        }
        // 열의 수가 더 많으면 행의 수를 열의 수와 동일하게 만들기 위해 0을 추가
        else if (numCols > numRows) {
            int[][] newArr = new int[numCols][numCols];
            for (int i = 0; i < numRows; i++) {
                System.arraycopy(arr[i], 0, newArr[i], 0, numCols);
            }
            arr = newArr;
        }

        return arr;
    }

    public static void main(String[] args) {
    	Sol03 solution = new Sol03();
        int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] arr2 = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        int[][] arr3 = {{1, 2}, {3, 4}};

        int[][] result1 = solution.solution(arr1);
        int[][] result2 = solution.solution(arr2);
        int[][] result3 = solution.solution(arr3);

        // 결과 출력
        for (int[] row : result1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] row : result2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] row : result3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
