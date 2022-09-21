package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이전 문제를 StringBuilder를 객체로 사용하는 풀이방법
public class P10_10814_2 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int N = Integer.parseInt(br.readLine());

      StringBuilder[] arr = new StringBuilder[201];
      
      for(int i=0; i<arr.length; i++) {
          arr[i] = new StringBuilder();
      }
      
      for(int i=0; i<N; i++) {
          st = new StringTokenizer(br.readLine());
          
          int age = Integer.parseInt(st.nextToken());
          String name = st.nextToken();
          
          arr[age].append(age).append(" ").append(name).append("\n");
      }
      
      StringBuilder sb = new StringBuilder();
      
      for(StringBuilder i:arr) {
          sb.append(i);
      }
      
      System.out.print(sb);
  }
  
}
