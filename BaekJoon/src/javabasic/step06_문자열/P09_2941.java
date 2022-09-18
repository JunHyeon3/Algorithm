package javabasic.step06_문자열;
import java.io.*;

// 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//입력 : 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
//출력 : 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다
public class P09_2941 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String S =  br.readLine();
      int count = 0;
      
      
      for(int i=0; i<S.length(); i++) {
          char C = S.charAt(i);
          
          if((C == 'c') && i<S.length()-1) {
              if(S.charAt(i+1) == '=' || S.charAt(i+1) == '-') {
                  i++;
              }
          }
          else if((C == 'd') && i<S.length()-2) {
              if(S.charAt(i+1) == 'z' &&  S.charAt(i+2) == '=') {
                  i += 2;
              }
              else if(S.charAt(i+1) == '-') {
                  i++;
              }
          }
          else if((C == 'd') && i<S.length()-1) {
              if(S.charAt(i+1) == '-') {
                  i++;
              }
          }
          else if((C == 'l' || C == 'n') && i<S.length()-1) {
              if(S.charAt(i+1) == 'j') {
                  i++;
              }
          }
          else if((C == 's' || C == 'z') && i<S.length()-1) {
              if(S.charAt(i+1) == '=') {
                  i++;
              }
          }
          
          count++;
      }
      
      System.out.print(count);
  }
  
}


//č   c=
//ć   c-
//dž  dz=
//đ   d-
//lj  lj
//nj  nj
//š   s=
//ž   z=