package javaBasic.step4_outputConversion;
import java.util.Scanner;

//10진 정수 입력받아 16진수로 출력하기2
//입력 : 10진수 1개가 입력된다.
//출력 : 16진수(대문자)로 출력한다.
public class Ex33 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    System.out.printf("%H", a);
    
    sc.close();    
  }
  
}
