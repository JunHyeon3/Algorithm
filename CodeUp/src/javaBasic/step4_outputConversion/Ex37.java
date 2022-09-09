package javaBasic.step4_outputConversion;
import java.util.Scanner;

// 정수 입력받아 아스키 문자로 출력하기
//입력 : 10진 정수 1개(0 ~ 255 범위)가 입력된다.
//출력 : 아스키코드 값을 문자로 출력한다.
public class Ex37 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    System.out.print((char)a);
    
    sc.close();    
  }
  
}
