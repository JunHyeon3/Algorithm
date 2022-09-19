package javabasic.step07_기본수학1;
import java.io.*;
import java.util.StringTokenizer;

// A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오
// 입력 : 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다
// 출력 : 첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.
public class P01_1712 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      long A = Integer.parseInt(st.nextToken());
      long B = Integer.parseInt(st.nextToken());
      long C = Integer.parseInt(st.nextToken());

      if(C <= B) {
          System.out.print(-1); 
      }
      else {
          System.out.print((A/(C-B))+1); 
      }
  }
  
}
