package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
// 입력 : 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
// 출력 : 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
public class P06_1427 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      String N = br.readLine();
      
      int[] counting = new int[10];
      
      for(int i=0; i<N.length(); i++) {
          int value = N.charAt(i) - '0';
          counting[value]++; 
      }
      
      for(int i=counting.length-1; i>=0; i--) {
          while(counting[i] > 0) {
              sb.append(i);
              counting[i]--;
          }
      }
  
      System.out.print(sb);
  }
  
}
