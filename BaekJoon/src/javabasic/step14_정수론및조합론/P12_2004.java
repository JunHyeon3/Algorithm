package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * (n m)의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 정수 n, m (0 <= m <= n <= 2,000,000,000, n != 0)이 들어온다.
 * 
 * [출력]
 * (n m)의 끝자리 0의 개수를 출력
 */
 
public class P12_2004 {

	static int count = 0;
	
	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count5 = find5(n) - find5(n-m) - find5(m);
		int count2 = find2(n) - find2(n-m) - find2(m);
		
		System.out.println(Math.min(count5, count2));
	}
	
	static public int find5(int num) {
		count = 0;
		
		while(num >= 5) {
			count += num / 5;
			num /= 5;
		}
		
		return count;
	}
	
	static public int find2(int num) {
		count = 0;
		
		while(num >= 2) {
			count += num / 2;
			num /= 2;
		}
		
		return count;
	}

}
