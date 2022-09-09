package javaBasic.step5_operation;
import java.util.Scanner;

// 정수 1개 입력받아 부호 바꿔 출력하기
//입력 : 정수 1개가 입력된다.
//출력 : 부호를 바꿔 출력한다.
public class Ex40 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    System.out.printf("%d", -a);
    
    sc.close();    
  }
  
}
