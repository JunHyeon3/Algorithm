package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
//      (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
// 출력 : 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
public class P07_11650 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();
      
      int N = Integer.parseInt(br.readLine());
      int[][] XY = new int[N][2];
      
      for(int i=0; i<N; i++) {
          st = new StringTokenizer(br.readLine(), " ");
          XY[i][0] = Integer.parseInt(st.nextToken());
          XY[i][1] = Integer.parseInt(st.nextToken());
      }
      
      //2차원 배열을 정렬하기 위해서 람다식 사용
      Arrays.sort(XY, (e1, e2) -> {
          //x좌표가 같을 경우
          if(e1[0] == e2[0]) {
              //y좌표의 차가 음수일 경우 위치를 바꾸지 않음, 양수일 경우 위치를 바꿈
              return e1[1] - e2[1];
          }
          //x좌표가 다를 경우
          else {
              //x좌표의 차로 위치를 바꿀지 결정
              return e1[0] - e2[0];
          }
      });

      for(int i=0; i<N; i++) {
          sb.append(XY[i][0] + " " + XY[i][1]).append("\n");
      }
      
      System.out.print(sb);
  }
  
}

// 람다식이란 함수를 하나의 식으로 표현한 것이다. 함수를 람다식으로 표현하면 메소드의 이름이 필요 없기 때문에, 
// 람다식은 익명 함수의 한 종류라고 볼 수 있다.
// 형태 : (매개변수, ... ) -> { 실행문 ... }
