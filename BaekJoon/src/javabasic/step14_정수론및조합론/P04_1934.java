package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
 * 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
 * 
 * [출력]
 * 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
 */

public class P04_1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		int num1 = 0, num2 = 0;
		
		for(int i=0; i<testCase; i++) {
			st = new StringTokenizer(br.readLine());
			
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			
			System.out.println(num1 * num2 / gcd(num1, num2));
		}
	}
	
	public static int gcd(int num1, int num2) {
		if(num2 == 0)
			return num1;
		else 
			return gcd(num2, num1 % num2);
	}

}

/*
 * [유클리드 호제법] - 최대공약수를 빠르게 구하는 방법
 * R = A % B
 * GCD(A, B) = GCD(B, R)
 * A와 B의 최대공약수 = B와 A를 B로 나눈 나머지와의 최대공약수
 */
