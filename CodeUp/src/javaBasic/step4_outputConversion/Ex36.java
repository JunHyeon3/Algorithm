package javaBasic.step4_outputConversion;
import java.util.Scanner;

// 영문자 1개 입력받아 10진수로 출력하기
//입력 : 영문자 1개가 입력된다.
//출력 : 아스키코드 값을 10진수로 출력한다.
public class Ex36 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char a = sc.next().charAt(0);
    
    System.out.print((int)a);
    
    sc.close();    
  }
  
}
