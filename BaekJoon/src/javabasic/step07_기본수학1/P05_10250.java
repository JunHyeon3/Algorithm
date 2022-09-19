package javabasic.step07_기본수학1;
import java.io.*;
import java.util.StringTokenizer;

//  호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정하는 프로그램을 작성하고자 한다.
//입력 : T 개의 테스트 데이터.H, W, N, 세 정수 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다
//출력 : 프로그램은 표준 출력에 출력한다. 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.
public class P05_10250 {
  
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int T = Integer.parseInt(br.readLine());
      
      StringTokenizer st;
      
      for(int i=0; i<T; i++) {
          st = new StringTokenizer(br.readLine());
          
          int H = Integer.parseInt(st.nextToken());
          st.nextToken();
          int N = Integer.parseInt(st.nextToken());
          
          if(N%H == 0) {
              System.out.printf("%d%02d", H, N/H);
              System.out.print("\n");
          }

          else {
              System.out.printf("%d%02d", N%H, (N/H) + 1);
              System.out.print("\n");
          }
      }
  }
  
}
