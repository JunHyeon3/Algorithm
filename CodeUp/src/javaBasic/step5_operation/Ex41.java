package javaBasic.step5_operation;
import java.util.Scanner;

// 문자 1개 입력받아 다음 문자 출력하기
//입력 : 영문자 1개가 입력된다.
//출력 : 다음 문자를 출력한다.
public class Ex41 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char a = sc.next().charAt(0);
    
    System.out.printf("%c", a+1);
    
    sc.close();    
  }
  
}
