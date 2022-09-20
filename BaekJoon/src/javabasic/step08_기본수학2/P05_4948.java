package javabasic.step08_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 
//입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다. 입력의 마지막에는 0이 주어진다.
//출력 : 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
public class P05_4948 {
  
  public static boolean arr[];
    
  public static void prime() {
      arr[0] = true;
      arr[1] = true;
      
      for(int i=2; i*i<=arr.length; i++) {
          if(!arr[i]) {
              for(int j=i*i; j<arr.length; j+=i) {
                  arr[j] = true;
              }
          }
      }
  }

  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      
      while(true) {
          int n = Integer.parseInt(br.readLine());
          int count = 0;

          if(n == 0) {
              break;
          }

          arr = new boolean[2*n+1];
          prime();
          
          for(int i=n+1; i<=2*n; i++) {
              if(!arr[i]) {
                  count++;
              }
          }
          
          System.out.println(count);
          
      }
      
  }
  
  
}
