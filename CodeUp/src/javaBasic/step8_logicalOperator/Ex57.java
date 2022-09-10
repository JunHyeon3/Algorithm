package javaBasic.step8_logicalOperator;
import java.util.Scanner;

// 참/거짓이 서로 같을 때에만 참 출력하기
//입력 : 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
//출력 : 참/거짓이 서로 같을 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
public class Ex57 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if((a==1 && b==1) || (a==0 && b==0))
      System.out.println(1);
    else
      System.out.println(0);
    
    sc.close();    
  }
  
}
