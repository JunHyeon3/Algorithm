package javabasic.step10_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
// (for문 대신 재귀를 사용하기)
// 입력 : 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
// 출력 : 첫째 줄에 N!을 출력한다.
public class P01_10872 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      
      System.out.print(factorial(N));
  }
  
  public static int factorial(int n) {
      if(n <= 1) {
          return 1;
      }
      else {
          return n * factorial(n-1);
      }
  }
  
}

// 재귀 함수란 특정 함수 내에서 자기 자신을 다시 호출하여 문제를 해결해나가는 함수