package javabasic.step08_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//입력 : 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다. M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
//출력 : M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
//      단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
public class P02_2581 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int M = Integer.parseInt(br.readLine());
      int N = Integer.parseInt(br.readLine());
      int sum = 0;
      int min = 10000;
      
      boolean[] arr = new boolean[10001];
      
      arr[0] = true;
      arr[1] = true;
      
      for(int i=2; i*i <= 10000; i++) {
          if(!arr[i]) {
              for(int j=i*i; j<= 10000; j+=i) {
                  arr[j] = true;              }
          }
      }
      
      
      for(int i=M; i<=N; i++) {
          if(!arr[i]) {
              sum += i;
              
              if(i<min) {
                  min = i;
              }
          }
      }
      
      if(sum == 0) {
          System.out.println(-1);
      }
      else {
          System.out.println(sum);
          System.out.println(min);
      }
  }
  
}
