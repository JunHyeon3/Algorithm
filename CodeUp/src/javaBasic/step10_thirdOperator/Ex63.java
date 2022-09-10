package javaBasic.step10_thirdOperator;
import java.util.Scanner;

// 두 정수 입력받아 큰 수 출력하기
//입력 : 두 정수가 공백을 두고 입력된다. -2147483648 ~ +2147483647
//출력 : 두 정수 중 큰 값을 10진수로 출력한다.
public class Ex63 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println(a>b?a:b);
    
    sc.close();    
  }
  
}
