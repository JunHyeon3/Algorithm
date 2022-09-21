package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
// 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
public class P03_10989 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      int N = Integer.parseInt(br.readLine());
      
      int[] counting = new int[10001];
      
      for(int i=0; i<N; i++) {
          counting[Integer.parseInt(br.readLine())]++;
      }
      
      for(int i=0; i<10001; i++) {
          while(true) {
              if(counting[i] == 0) {
                  break;
              }
              
              sb.append(i).append("\n");
              
              counting[i]--;
          }
      }
      
      System.out.println(sb);
  }
  
}
