package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 * 
 * [출력]
 * 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 */

public class P03_2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int count = 0;
				
		count = (num1 > num2) ? num1 : num2;
		while(true) {
			if ((num1 % count) == 0 && (num2 % count) == 0) {
				System.out.println(count);
				break;
			}
			
			count--;
		}
		
		count = (num1 > num2) ? num1 : num2;
		while(true) {
			if ((count % num1) == 0 && (count % num2) == 0) {
				System.out.println(count);
				break;
			}
			
			count ++;
		}
		
	}

}
