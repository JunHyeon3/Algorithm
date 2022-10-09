package javabasic.step14_정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * [문제]
 * 해빈이가 가진 의상들이 주어졌을때 과연 해빈이는 알몸이 아닌 상태로 며칠동안 밖에 돌아다닐 수 있을까?
 * 
 * [입력]
 * 첫째 줄에 테스트 케이스가 주어진다. 테스트 케이스는 최대 100이다.
 * 첫째 줄에는 해빈이가 가진 의상의 수 n(0 ≤ n ≤ 30)이 주어진다.
 * 다음 n개에는 해빈이가 가진 의상의 이름과 의상의 종류가 공백으로 구분되어 주어진다. 같은 종류의 의상은 하나만 입을 수 있다.
 * 모든 문자열은 1이상 20이하의 알파벳 소문자로 이루어져있으며 같은 이름을 가진 의상은 존재하지 않는다/
 * 
 * [출력]
 * 각 테스트 케이스에 대해 해빈이가 알몸이 아닌 상태로 의상을 입을 수 있는 경우를 출력하시오.
 */

public class P10_9375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			// key는 의상의 종류, value는 의상 종류의 개수
			HashMap<String, Integer> hashMap = new HashMap<>();
			
			int N = Integer.parseInt(br.readLine());
			
			for(int j=0; j<N; j++) {
				st = new StringTokenizer(br.readLine());
				
				// 의상의 이름은 필요없으므로 버림
				st.nextToken();			
				// 의상의 종류를 기록
				String clothes = st.nextToken();
				
				// map에 의상 종류가 없으면, key에 의상 종류, value에 1을 입력
				if(!hashMap.containsKey(clothes)) {
					hashMap.put(clothes, 1);
				}
				// map의 key에 의상 종류가 있으면, 해당 value값에 +1
				else {
					hashMap.put(clothes, hashMap.get(clothes)+1);
				}
			}
			
			int result = 1;
			
			// value값에 +1한 값을 곱하는 이유는 해당 의상을 안입었을 경우도 포함
			for(int k: hashMap.values()) {
				result *= (k+1);
			}
			
			// 결과 값에서 -1은 아무것도 안입었을 경우를 제외
			System.out.println(result - 1);
		}
		
	}
	
}
