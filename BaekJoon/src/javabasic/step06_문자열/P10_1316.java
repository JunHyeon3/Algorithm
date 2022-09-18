package javabasic.step06_문자열;
import java.io.*;

// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
//      둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//출력 : 첫째 줄에 그룹 단어의 개수를 출력한다.
public class P10_1316 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      int count = 0;

      for(int i=0; i<N; i++) {
          String S = br.readLine();
          boolean check = true;
          
          for(int j=0; j<S.length(); j++) {
              char C = S.charAt(j);
              
              for(int k=j+1; k<S.length(); k++) {
                  if(C == S.charAt(k) ) {
                      if(S.charAt(k) != S.charAt(k-1)) {
                          check = false;
                      }
                  }
              }
          }
          
          if(check) {
              count++;
          }
          
      }
      System.out.print(count);
      
  }
  
}
