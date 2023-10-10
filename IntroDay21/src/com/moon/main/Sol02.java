/**
 * 안전지대
문제 설명
다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.

지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.

제한사항
board는 n * n 배열입니다.
1 ≤ n ≤ 100
지뢰는 1로 표시되어 있습니다.
board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
입출력 예
board	result
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]	16
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]	13
[[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]	0
입출력 예 설명
입출력 예 #1

(3, 2)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선 총 8칸은 위험지역입니다. 따라서 16을 return합니다.
입출력 예 #2

(3, 2), (3, 3)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선은 위험지역입니다. 따라서 위험지역을 제외한 칸 수 13을 return합니다.
입출력 예 #3

모든 지역에 지뢰가 있으므로 안전지역은 없습니다. 따라서 0을 return합니다.
 */
package com.moon.main;

public class Sol02 {
	    public int solution(int[][] board) {
	        int answer = 0;

	        //위험지대 표시할 새로운 배열
	        int [][] newBoard =  new int [board.length][board[0].length];

	        //지뢰 위치 찾기
	        for(int i=0 ; i< board.length; i++){

	            for(int j=0 ; j< board[i].length; j++){

	                 if(board[i][j]==1){

	                     danger(i, j, newBoard);                       
	               }        
	            }
	        }

	       //출력
	       // printTable(board);
	       // printTable(newBoard);

	        answer = countDanger(newBoard);

	        return answer;
	    }

	    //지뢰 + 위험 지역 표시
	    void danger(int i, int j, int[][] newBoard){

	         int overX = newBoard.length;
	         int overY = newBoard[0].length;

	          newBoard[i][j] = 1;
	          if(i > 0) newBoard[i-1][j] =1;
	          if(i < overX-1) newBoard[i+1][j] =1;
	          if(j < overY-1) newBoard[i][j+1] =1;
	          if(j > 0) newBoard[i][j-1] =1;
	          if(i > 0 && j>0) newBoard[i-1][j-1] =1;
	          if(i < overX-1 && j>0) newBoard[i+1][j-1] =1;
	          if(i > 0 && j<overY-1) newBoard[i-1][j+1] =1;
	          if(i < overX-1 && j<overY-1) newBoard[i+1][j+1] =1;

	    }
	    //0 숫자세기
	    int countDanger(int[][] board){

	        int count =0 ;
	        for(int i=0 ; i< board.length; i++){

	            for(int j=0 ; j< board[i].length; j++){

	                   if(board[i][j]==0){
	                        count++;
	                 }            
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {

	    	Sol02 solution = new Sol02();
	        int[][] board1 = {
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 1, 0, 0},
	            {0, 0, 0, 0, 0}
	        };
	        
	        int[][] board2 = {
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 1, 1, 0},
	            {0, 0, 0, 0, 0}
	        };
	        
	        int[][] board3 = {
	            {1, 1, 1, 1, 1, 1},
	            {1, 1, 1, 1, 1, 1},
	            {1, 1, 1, 1, 1, 1},
	            {1, 1, 1, 1, 1, 1},
	            {1, 1, 1, 1, 1, 1},
	            {1, 1, 1, 1, 1, 1}
	        };
	        
	        int result1 = solution.solution(board1);
	        int result2 = solution.solution(board2);
	        int result3 = solution.solution(board3);

	        System.out.println(result1); // 16
	        System.out.println(result2); // 13
	        System.out.println(result3); // 0
	    }
	    
	}

