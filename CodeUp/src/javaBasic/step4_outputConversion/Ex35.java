package javaBasic.step4_outputConversion;
import java.util.Scanner;

// 16진 정수 1개 입력받아 8진수로 출력하기
//입력 : 16진 정수 1개가 입력된다. (단, 16진수는 영문 소문자로 입력된다.)
//출력 : 8진수로 바꾸어 출력한다.
public class Ex35 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt(16);
    
    System.out.printf("%o", a);
    
    sc.close();    
  }
  
}
