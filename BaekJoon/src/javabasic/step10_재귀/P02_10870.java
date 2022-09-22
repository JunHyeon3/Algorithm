package javabasic.step10_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
// 출력 : 첫째 줄에 n번째 피보나치 수를 출력한다.
public class P02_10870 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(br.readLine());
      
      System.out.print(pibonacci(n));
  }
  
  public static int pibonacci(int n) {
      if(n == 0) {
          return 0;
      }
      if(n == 1) {
          return 1;
      }

      return pibonacci(n-1) + pibonacci(n-2);
  }
}
