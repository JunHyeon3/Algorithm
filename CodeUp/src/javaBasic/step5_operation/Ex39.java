package javaBasic.step5_operation;
import java.util.Scanner;

// 정수 2개 입력받아 합 출력하기2
//입력 : 2개의 정수가 공백으로 구분되어 입력된다.
//출력 : 두 정수의 합을 출력한다.
public class Ex39 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    long b = sc.nextLong();
    
    System.out.printf("%d", a+b);
    
    sc.close();    
  }
  
}
