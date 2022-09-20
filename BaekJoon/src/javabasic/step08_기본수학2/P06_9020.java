package javabasic.step08_기본수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
//입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.
//출력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.
public class P06_9020 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      boolean[] arr = new boolean[10001];
      
      arr[0] = true;
      arr[1] = true;
      
      for(int i=2; i*i<=10000; i++) {
          if(!arr[i]) {
              for(int j=i*i; j<10000; j+=i) {
                  arr[j] = true;
              }
          }
      }
      
      int T = Integer.parseInt(br.readLine());
      
      for(int i=0; i<T; i++) {
          int n = Integer.parseInt(br.readLine());
          
          for(int j=n/2; j>=2; j--) {
              if(!arr[j] && !arr[n-j]) {
                  bw.write(j + " " + (n-j) + "\n");
                  break;
              }
          }
      }
      
      bw.flush();
      bw.close();
  }
  
}
