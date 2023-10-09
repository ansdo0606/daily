/**
 * 직사각형 넓이 구하기
	문제 설명
	2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 
	[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 
	직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	dots의 길이 = 4
	dots의 원소의 길이 = 2
	-256 < dots[i]의 원소 < 256
	잘못된 입력은 주어지지 않습니다.
	입출력 예
	dots	result
	[[1, 1], [2, 1], [2, 2], [1, 2]]	1
	[[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
	입출력 예 설명
	입출력 예 #1
	
	좌표 [[1, 1], [2, 1], [2, 2], [1, 2]] 를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 
	각각 1, 1이므로 직사각형의 넓이는 1 x 1 = 1입니다.
	입출력 예 #2
	
	좌표 [[-1, -1], [1, 1], [1, -1], [-1, 1]]를 꼭짓점으로 갖는 직사각형의 가로, 세로 길이는 
	각각 2, 2이므로 직사각형의 넓이는 2 x 2 = 4입니다.
 */
package com.moon.main;

public class Sol01 {
	 public static int solution(int[][] dots) {
	        int[] xDot = new int[dots.length];
	        int[] yDot = new int[dots.length];

	        // xDot 배열과 yDot 배열에 x와 y 좌표를 저장
	        for (int i = 0; i < dots.length; i++) {
	            xDot[i] = dots[i][0];
	            yDot[i] = dots[i][1];
	        }

	        // x 좌표의 최댓값과 최솟값을 찾음
	        int maxX = Integer.MIN_VALUE;
	        int minX = Integer.MAX_VALUE;
	        for (int x : xDot) {
	            maxX = Math.max(maxX, x);
	            minX = Math.min(minX, x);
	        }

	        // y 좌표의 최댓값과 최솟값을 찾음
	        int maxY = Integer.MIN_VALUE;
	        int minY = Integer.MAX_VALUE;
	        for (int y : yDot) {
	            maxY = Math.max(maxY, y);
	            minY = Math.min(minY, y);
	        }

	        // 직사각형의 넓이 계산
	        int width = maxX - minX;
	        int height = maxY - minY;
	        int area = width * height;

	        return area;
	    }

	    public static void main(String[] args) {

	        int[][] dots1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
	        int result1 = solution(dots1);
	        System.out.println(result1); // 1 출력

	        int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
	        int result2 = solution(dots2);
	        System.out.println(result2); // 4 출력
	    }
}
