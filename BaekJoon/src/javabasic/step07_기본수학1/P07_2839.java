package javabasic.step07_기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 3kg 5kg 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
//출력 : 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
public class P07_2839 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      
      if(N == 4 || N == 7) {
          System.out.println(-1);
      }
      else if(N%5 == 0) {
          System.out.println(N/5);
      }
      else if(N%5 == 1 || N%5 == 3) {
          System.out.println(N/5 + 1);
      }
      else if(N%5 == 2 || N%5 == 4) {
          System.out.println(N/5 + 2);
      }
  }
  
}
