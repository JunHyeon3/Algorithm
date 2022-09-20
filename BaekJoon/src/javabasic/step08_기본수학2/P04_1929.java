package javabasic.step08_기본수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
//출력 : 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
public class P04_1929 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
      
      boolean[] arr = new boolean[N+1];
      
      arr[0] = true;
      arr[1] = true;
      
      for(int i=2; i*i<=N+1; i++) {
          if(!arr[i]) {
              for(int j=i*i; j<N+1; j+=i) {
                  arr[j] = true;
              }
          }
      }
      
      for(int i=M; i<=N; i++) {
          if(!arr[i]) {
              bw.write(i + "\n");
          }
      }
      
      bw.flush();
      bw.close();
  }
  
}
