/**
 * 분수의 덧셈
	문제 설명
	첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 
	numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 
	담은 배열을 return 하도록 solution 함수를 완성해보세요.
	
	제한사항
	0 <numer1, denom1, numer2, denom2 < 1,000
	입출력 예
	numer1	denom1	numer2	denom2	result
	1		2		3		4		[5, 4]
	9		2		1		3		[29, 6]
	입출력 예 설명
	입출력 예 #1
	
	1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
	입출력 예 #2
	
	9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.
 */
package com.moon.main;

//내가 푼 식
public class Sol03 {
	// 최대공약수를 계산하는 메서드
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int commonDenominator = denom1 * denom2; // 두 분모의 곱을 공통 분모로 설정
        int newNumer1 = numer1 * denom2; // 첫 번째 분수의 분자를 공통 분모로 변환
        int newNumer2 = numer2 * denom1; // 두 번째 분수의 분자를 공통 분모로 변환
        int resultNumer = newNumer1 + newNumer2; // 두 분수를 더한 분자

        // 분자와 분모의 최대공약수를 구해서 기약 분수로 만듦
        int gcd = gcd(resultNumer, commonDenominator);
        int[] result = {resultNumer / gcd, commonDenominator / gcd};

        return result;
    }

    public static void main(String[] args) {
    	Sol03 solution = new Sol03();
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        int[] result = solution.solution(numer1, denom1, numer2, denom2);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        numer1 = 9;
        denom1 = 2;
        numer2 = 1;
        denom2 = 3;
        result = solution.solution(numer1, denom1, numer2, denom2);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}


//다른 사람의 식
//public int[] solution(int denum1, int num1, int denum2, int num2) {
//    int mother = num1 * num2;
//    int son1 = num1 * denum2;
//    int son2 = num2 * denum1;
//    int totalSon = son1 + son2;
//    for(int i = mother; i >= 1; i--){
//        if(totalSon % i == 0 && mother % i == 0){
//            totalSon /= i;
//            mother /= i;
//        }
//    }
//    int[] answer = {totalSon, mother};
//    return answer;
//}
