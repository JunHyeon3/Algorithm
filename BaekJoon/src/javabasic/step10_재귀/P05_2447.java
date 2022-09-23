package javabasic.step10_재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 재귀적인 패턴으로 별을 찍어 보자. 크기 N의 패턴은 N×N 정사각형 모양이다. 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
// 입력 : 첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.
// 출력 : 첫째 줄부터 N번째 줄까지 별을 출력한다.
public class P05_2447 {
  
    
      public static String[][] arr;
    
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          
          int N = Integer.parseInt(br.readLine());
          
          arr = new String[N][N];
          
          make_star(0, 0, N);
           
          for(int i=0; i<N; i++) {
              for(int j=0; j<N; j++) {
                  bw.write(arr[i][j] == null ? " " : arr[i][j]);
              }
              bw.write("\n");
          }
          
          bw.flush();
          bw.close();
      }
      
      public static void make_star(int x, int y, int N) {
          if(N == 1) {
              arr[x][y] = "*";
              return;
          }
          for(int i=0; i<3; i++) {
              for(int j=0; j<3; j++) {
                  if(!(i == 1 && j == 1)) {
                      make_star(x + (i * (N/3)), y + (j * (N/3)), N/3);
                  }
              }
          }
      }
  
}
