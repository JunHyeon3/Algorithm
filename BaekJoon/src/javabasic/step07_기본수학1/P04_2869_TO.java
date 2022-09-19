package javabasic.step07_기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 높이가 V미터인 나무 막대를 올라갈 것이다. 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
// 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
//출력 : 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
public class P04_2869_TO {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
//시간 초과     
//      int A = Integer.parseInt(st.nextToken());
//      int B = Integer.parseInt(st.nextToken());
//      int V = Integer.parseInt(st.nextToken());
//      int day = 1;
//      int current = 0;
//      while(true) {
//          current += A;
//
//          if(current < V) {
//              current -= B;
//              day++;
//          }
//          else {
//              break;
//          }
//      }
//      System.out.print(day);
      
//해결 방법
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int V = Integer.parseInt(st.nextToken());
      
      int dest = V - B;
      int move = A - B;
      
      if(dest%move != 0) {
          System.out.println(dest/move + 1);
      }
      else {
          System.out.println(dest/move);
      }
  }
  
}

