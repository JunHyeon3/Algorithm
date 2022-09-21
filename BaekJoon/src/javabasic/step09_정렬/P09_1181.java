package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오. 길이가 짧은 것부터 길이가 같으면 사전 순으로
// 입력 : 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
//      주어지는 문자열의 길이는 50을 넘지 않는다.
// 출력 : 조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
public class P09_1181 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      int N = Integer.parseInt(br.readLine());
      
      String[] arr = new String[N];
     
      for(int i=0; i<N; i++) {
          arr[i] = br.readLine();
      }
      
      Arrays.sort(arr, (s1, s2) -> {
          //s1과 s2의 길이가 다르면
          if(s1.length() != s2.length()) {
              //길이 순으로 정렬
              return s1.length() - s2.length();
          }
          //s1과 s2의 길이가 같으면
          else {
              //s1과 s2를 비교하여 사전 순으로 정렬
              return s1.compareTo(s2);
          }
      });
      
      sb.append(arr[0]).append("\n");
      
      for(int i=1; i<N; i++) {
          if(!arr[i].equals(arr[i-1])) {
              sb.append(arr[i]).append("\n");
          }
      }
      
      System.out.print(sb);
  }
  
}


//문자열1.equals(문자열2) 
//문자열1과 문자열2를 비교하며 boolean값을 반환
//같으면 true 다르면 false

//문자열1.compareTo(문자열2) 
//문자열1과 문자열2가 단순히 같은지 아닌지를 알려줄 뿐만 아니라 어떤것이 사전적인 순서로 더 앞,뒤에 존재하는지를 알려준다.
//반환값이 음수면 호출한 문자열이 더 앞, 0이면 문자열이 동일, 양수면 매개변수 문자열이 더 앞