package javabasic.step10_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 하노이 탑 이동 순서
// 입력 : 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.
// 출력 : 첫째 줄에 옮긴 횟수 K를 출력한다. 두 번째 줄부터 수행 과정을 출력한다. 
//      두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
public class P06_11729 {
  
  public static StringBuilder sb = new StringBuilder();
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      
      sb.append((int)(Math.pow(2, N)) - 1).append("\n");
      
      hanoi(N, 1, 2, 3);
      
      System.out.print(sb);
  }
  
  public static void hanoi(int N, int start, int mid, int end) {
      if(N == 1) {
          sb.append(start + " " + end).append("\n");
          
          return;
      }
      
      // N-1개의 원판을 1번에서 2번으로 이동
      hanoi(N - 1, start, end, mid);
      
      // N-1개를 옮기고 1번에 남은 원판 한개를 3번으로 이동
      sb.append(start + " " + end).append("\n");
      
      // 2번에 있는 N-1개의 원판을 1번으로 이동 
      hanoi(N - 1, mid, start, end);
  }
}
