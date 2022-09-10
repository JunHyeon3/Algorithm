package javaBasic.step11_conditional;
import java.util.Scanner;

// 정수 1개 입력받아 평가 출력하기
//입력 : 정수(0 ~ 100) 1개가 입력된다.
//출력 : 평가 결과를 출력한다.
public class Ex68 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    if(a <= 100 && a >= 90)
      System.out.println("A");
    else if(a < 90 && a >= 70)
      System.out.println("B");
    else if(a < 70 && a >= 40)
      System.out.println("C");
    else if(a < 40 && a >= 0)
      System.out.println("D");
    
    sc.close();    
  }
  
}
