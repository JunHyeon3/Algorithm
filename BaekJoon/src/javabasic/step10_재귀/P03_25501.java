package javabasic.step10_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 S를 isPalindrome 함수의 인자로 전달하여 팰린드롬 여부를 반환값으로 알아낼 것이다. 더불어 판별하는 과정에서 recursion 함수를 몇 번 호출하는지 셀 것이다.
// 입력 : 첫째 줄에 테스트케이스의 개수 T가 주어진다. (1 <= T <=1,000)
//      둘째 줄부터 T개의 줄에 알파벳 대문자로 구성된 문자열 S가 주어진다. (1 <= |S| <= 1,000)
// 출력 : 각 테스트케이스마다, isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수를 한 줄에 공백으로 구분하여 출력한다.
public class P03_25501 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      int T = Integer.parseInt(br.readLine());
      
      for(int i=0; i<T; i++) {
          String S = br.readLine();
          
          sb.append(isPalindrome(S)[0] + " " + isPalindrome(S)[1]).append("\n");
      }
      
      System.out.print(sb);
  }
  
  static int count = 0;
  
  public static int[] recursion(String S, int l, int r) {
      count++;
      
      if(l >= r) {
          return new int[] {1, count};
      }
      else if(S.charAt(l) != S.charAt(r)) {
          return new int[] {0, count};
      }
      else {
          return recursion(S, l+1, r-1);
      }
  }
  
  public static int[] isPalindrome(String S) {
      count = 0;
      
      return recursion(S, 0, S.length()-1);
  }
  
}
