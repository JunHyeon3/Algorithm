package javaBasic.step12_repetition;
import java.util.Scanner;

// 문자 1개 입력받아 알파벳 출력하기
//입력 : 영문자 1개가 입력된다. (a ~ z)
//출력 : a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.
public class Ex76 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char a = sc.next().charAt(0);
    char b = 'a';
    
    for(int i=(int)b; i<(int)a+1; i++) {
      System.out.printf("%c ", b);
      b++;
    }
    
    sc.close();    
  }
  
}
