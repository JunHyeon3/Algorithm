package javabasic.step07_기본수학1;
import java.io.*;

// 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오
//입력 : 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
//출력 : 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
public class P02_2292 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      int count = 1;
      int check = 2;
      
      if(N==1) {
          System.out.print(1);
      }
      
      else {
          while (true) {
              if(N < check) {
                  break;
              }
              
              check += (6 * count);
              count ++;
          }
          
          System.out.print(count);
      }
  }
  
}
