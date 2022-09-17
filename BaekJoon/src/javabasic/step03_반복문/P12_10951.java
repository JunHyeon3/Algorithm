package javabasic.step03_반복문;
import java.util.*;
import java.io.*;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력 : 각 테스트 케이스마다 A+B를 출력한다.
public class P12_10951 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String S;
    
    StringTokenizer st;
    
    //입력을 입력하고 ctrl + z 를 눌러 입력을 종료해야한다.
    while((S=br.readLine()) != null) {
      st = new StringTokenizer(S, " ");
      
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      
      bw.write(A + B + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
  
}
