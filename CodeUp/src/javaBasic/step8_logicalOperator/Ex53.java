package javaBasic.step8_logicalOperator;
import java.util.Scanner;

// 참 거짓 바꾸기
//입력 : 정수 1개가 입력된다.(단, 0 또는 1 만 입력된다.)
//출력 : 입력된 값이 0이면 1, 1이면 0을 출력한다.
public class Ex53 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    if(a == 0)
      System.out.println(1);
    else if (a == 1)
      System.out.println(0);
    
    sc.close();    
  }
  
}
