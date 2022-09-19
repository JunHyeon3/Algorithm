package javabasic.step07_기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
//출력 : 첫째 줄에 A+B를 출력한다.
public class P08_10757 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      String A = st.nextToken();
      String B = st.nextToken();
      
      int length  = (A.length()>B.length())? A.length():B.length();
      
      int[] arr_A = new int[length + 1];
      int[] arr_B = new int[length + 1];
      
      for(int i=A.length()-1, j=length; i>=0; i--, j--) {
          arr_A[j] = A.charAt(i) - '0';
      }
      for(int i=B.length()-1, j=length; i>=0; i--, j--) {
          arr_B[j] = B.charAt(i) - '0';
      }
      
      for(int i=length; i>=0; i--) {
          int sum = arr_A[i] + arr_B[i];
          
          arr_A[i] = sum%10;
          
          if(i != 0) {
              arr_A[i-1] += sum/10;
          }
      }
      
      StringBuilder sb = new StringBuilder();
      
      if(arr_A[0] != 0) {
          sb.append(arr_A[0]);
      }
      
      for(int i=1; i<=length; i++) {
          sb.append(arr_A[i]);
      }
      
      System.out.print(sb);
  }
  
}
