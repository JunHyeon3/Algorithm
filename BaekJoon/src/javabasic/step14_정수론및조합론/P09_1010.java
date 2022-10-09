package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * N개와 M개의 사이트를 연결하는 다리를 지을 수 있는 경우의 수를 구하는 프로그램을 작성하라.
 * 
 * [입력]
 * 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 
 * 그 다음 줄부터 각각의 테스트케이스에 대해 강의 서쪽과 동쪽에 있는 사이트의 개수 정수 N, M (0 < N ≤ M < 30)이 주어진다.
 * 
 * [출력]
 * 각 테스트 케이스에 대해 주어진 조건하에 다리를 지을 수 있는 경우의 수를 출력한다.
 */

public class P09_1010 {

	public static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			arr = new int[M+1][N+1];
			
			System.out.println(binomialCoefficient(M, N));
		}
		
	}
	
	public static int binomialCoefficient(int n, int k) {
		if(arr[n][k] > 0)
			return arr[n][k];
		
		if(n == k || k == 0)
			return arr[n][k] = 1;
		else
			return arr[n][k] = binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
	}
}
