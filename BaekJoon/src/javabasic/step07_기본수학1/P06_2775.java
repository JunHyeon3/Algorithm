package javabasic.step07_기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다 k층에 n호에는 몇 명이 살고 있는지 출력하라. 
//입력 : 첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다
//출력 : 각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라
public class P06_2775 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int[][] arr = new int[15][15];
      
      for(int i=0; i<15; i++) {
          arr[0][i] = i;
          arr[i][1] = 1;
      }

      for(int i=1; i<15; i++) {
          for(int j=2; j<15; j++) {
              arr[i][j] = arr[i-1][j] + arr[i][j-1];
          }
      }
      
      int T = Integer.parseInt(br.readLine());
      
      for(int i=0; i<T; i++) {
          int k = Integer.parseInt(br.readLine());
          int n = Integer.parseInt(br.readLine());
          
          System.out.println(arr[k][n]);
      }
      
  }
  
}
