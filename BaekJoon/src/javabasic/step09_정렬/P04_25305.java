package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// N명의 학생들이 응시했다. 이들 중 점수가 가장 높은 k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
// 입력 : 첫째 줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다.
//       둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다.
// 출력 : 상을 받는 커트라인을 출력하라.
public class P04_25305 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      st = new StringTokenizer(br.readLine());
      
      int N = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      
      int[] arr = new int[N];
      
      st = new StringTokenizer(br.readLine());

      for(int i=0; i<N; i++) {
          
          arr[i] = Integer.parseInt(st.nextToken());
      }
      
      Arrays.sort(arr);
      
      System.out.print(arr[N-k]);
  }
  
}
