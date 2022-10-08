package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 링의 반지름이 주어진다. 이때, 첫 번째 링을 한 바퀴 돌리면, 나머지 링은 몇 바퀴 돌아가는지 구하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 링의 개수 N이 주어진다. (3 ≤ N ≤ 100)
 * 다음 줄에는 링의 반지름이 상근이가 바닥에 놓은 순서대로 주어진다. 반지름은 1과 1000를 포함하는 사이의 자연수이다
 * 
 * [출력]
 * 출력은 총 N-1줄을 해야 한다. 첫 번째 링을 한 바퀴 돌리면 그 외의 링은 몇 바퀴 도는지 기약 분수 형태 A/B로 출력한다.
 */

public class P06_3036 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int gcd = 0;
		for(int i=1; i<N; i++) {
			gcd = gcd(arr[0], arr[i]);
			
			System.out.println(arr[0] / gcd + "/" + arr[i] / gcd);
		}
		
	}
	
	public static int gcd(int num1, int num2) {
		if(num2 == 0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}

}
