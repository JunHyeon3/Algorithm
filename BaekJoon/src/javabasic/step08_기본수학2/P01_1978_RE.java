package javabasic.step08_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
// 입력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
// 출력 : 주어진 수들 중 소수의 개수를 출력한다.
public class P01_1978_RE {
  
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
//에라토스테네스의 체로 소수 판별 ------------------------------------------     
      boolean[] arr = new boolean[1001];
      
      arr[0] = true;
      arr[1] = true;
      
      for(int i=2; (i*i)<=1000; i++) {
          if(!arr[i]) {
              for(int j=(i*i); j<=1000; j+=i) {
                  arr[j] = true;
              }
          }
      }
//--------------------------------------------------------------     
      
      int N = Integer.parseInt(br.readLine());
      int count = 0;
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      for(int i=0; i<N; i++) {
          int number = Integer.parseInt(st.nextToken());
          
          if(!arr[number]) {
              count++;
          }
      }
      
      System.out.print(count);
  }
  
}
