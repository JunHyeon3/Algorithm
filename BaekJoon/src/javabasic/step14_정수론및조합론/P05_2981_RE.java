package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * [문제]
 * 숫자 N개를 종이에 적는다. 그 다음, 종이에 적은 수를 M으로 나누었을 때, 나머지가 모두 같게 되는 M을 모두 찾으려고 한다. 
 * N개의 수가 주어졌을 때, 가능한 M을 모두 찾는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 종이에 적은 수의 개수 N이 주어진다. (2 ≤ N ≤ 100)
 * 다음 줄부터 N개 줄에는 종이에 적은 수가 하나씩 주어진다. 이 수는 모두 1보다 크거나 같고, 1,000,000,000보다 작거나 같은 자연수이다. 
 * 같은 수가 두 번 이상 주어지지 않는다. 항상 M이 하나 이상 존재하는 경우만 입력으로 주어진다.
 * 
 * [출력]
 * 첫째 줄에 가능한 M을 공백으로 구분하여 모두 출력한다. 이때, M은 증가하는 순서이어야 한다.
 */

public class P05_2981_RE {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int gcdValue = arr[1] - arr[0];
		
		for(int i=2; i<N; i++) {
			gcdValue = gcd(gcdValue, arr[i] - arr[i-1]);
		}
		
		for(int i=2; i<=gcdValue; i++) {
			if(gcdValue % i == 0)
				System.out.print(i + " ");
		}
		
	}
	
	public static int gcd(int num1, int num2) {
		if(num2 == 0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}

}

/*
 * a = m * x1 + r1
 * b = m * x2 + r2
 * 
 * a-b = m * (x1 - x2) 
 * 
 * m은 a-b의 약수
 */
