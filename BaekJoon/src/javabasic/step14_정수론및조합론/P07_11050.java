package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 자연수 N과 정수 K가 주어졌을 때 이항 계수 (N K)를 구하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 0 ≤ K ≤ N)
 * 
 * [출력]
 * (N K)를 출력
 */

public class P07_11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(N) / (factorial(N-K)*factorial(K)));
	}
	
	public static int factorial(int num) {
		if(num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}

}

/* 
 * [이항계수]
 * 방법1)
 * (n  k) = n! / (n-k)!k!
 * 
 * 방법2)
 * (n  k) = (n-1  k-1) + (n-1  k)
 * (n  0) = (n  n) = 1
 * 
 */