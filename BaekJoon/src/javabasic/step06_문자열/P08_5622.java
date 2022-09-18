package javabasic.step06_문자열;
import java.io.*;

// 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
//출력 : 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
public class P08_5622 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String S = br.readLine();
      int sec = 0;
      
      for(int i=0; i<S.length(); i++) {
          switch (S.charAt(i)) {
              case 'A': case 'B': case 'C':
                  sec += 3;
                  break;
              case 'D': case 'E': case 'F':
                  sec += 4;
                  break;
              case 'G': case 'H': case 'I':
                  sec += 5;
                  break;
              case 'J': case 'K': case 'L':
                  sec += 6;
                  break;
              case 'M': case 'N': case 'O':
                  sec += 7;
                  break;
              case 'P': case 'Q': case 'R': case 'S':
                  sec += 8;
                  break;
              case 'T': case 'U': case 'V':
                  sec += 9;
                  break;
              case 'W': case 'X': case 'Y': case 'Z':
                  sec += 10;
                  break;
          }
      }
      
      System.out.print(sec);
  }
  
}
