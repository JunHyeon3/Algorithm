package javabasic.step07_기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자. 
// X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
//출력 : 첫째 줄에 분수를 출력한다.
public class P03_1193_RE {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int X = Integer.parseInt(br.readLine());
      int check = 1;
      int check_sum = 0;
      
      while(true) {
          if(X <= check+check_sum) {
              if(check%2 == 1) {
                  System.out.print( ((check+1)-(X-check_sum)) + "/" + (X-check_sum) );
                  break;
              }
              
              else {
                  System.out.print( (X-check_sum) + "/" + ((check+1)-(X-check_sum)) );
                  break;
              }
          }
          else {
              check_sum += check;
              check++;
          }
          
      }
  }
  
}
