package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 자연수 N과 정수 K가 주어졌을 때 이항 계수 (N K)를 10,007로 나눈 나머지를 구하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ K ≤ N)
 * 
 * [출력]
 * (N K)를 10,007로 나눈 나머지를 출력
 */

public class P08_11051_RE {
	
	public static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][K+1];
		
		System.out.println(binomialCoefficient(N, K));
	}
	
	// 이항계수 구하는 방법 + 동적계획법
	public static int binomialCoefficient(int n, int k) {
		if(arr[n][k] > 0)
			return arr[n][k];
		
		if(n == k || k == 0)
			return arr[n][k] = 1;
		else
			return arr[n][k] = (binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k)) % 10007;
	}
	
	//시간초과
//	public static int binomialCoefficient(int n, int k) {
//		if(n == k || k == 0)
//			return 1;
//		else
//			return (binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k)) % 10007;
//	}

}
