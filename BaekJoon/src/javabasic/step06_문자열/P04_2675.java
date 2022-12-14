package javabasic.step06_문자열;
import java.io.*;
import java.util.StringTokenizer;

// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오
//입력 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
//      S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
//출력 : 각 테스트 케이스에 대해 P를 출력한다
public class P04_2675 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(br.readLine());
    
    StringTokenizer st;
    
    for(int i=0; i<T; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      
      int R = Integer.parseInt(st.nextToken());
      String S = st.nextToken();
      
      for(int j=0; j<S.length(); j++) {
        for(int k=0; k<R; k++) {
          System.out.print(S.charAt(j));
        }
      }
      
      System.out.print("\n");
    }
    
  }
  
}
