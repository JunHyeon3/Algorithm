package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
 * 1. 첫 번째 숫자가 두 번째 숫자의 약수이다.
 * 2. 첫 번째 숫자가 두 번째 숫자의 배수이다.
 * 3. 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
 * 
 * [입력]
 * 입력은 여러 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 
 * 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.
 * 
 * [출력]
 * 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
 */

public class P01_5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if (num1 == 0 && num2 == 0) 
				break;
			
			if (num2%num1 == 0) {
				System.out.println("factor");
			}
			else if (num1%num2 == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
			
		}
		
	}

}
