package javaBasic.step9_bitwiseOperator;
import java.util.Scanner;

// 비트단위로 OR 하여 출력하기
//입력 : 2개의 정수가 공백을 두고 입력된다. -2147483648 ~ +2147483647
//출력 : 두 정수를 비트단위(bitwise)로 or 계산을 수행한 결과를 10진수로 출력한다.
public class Ex61 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println(a|b);
    
    sc.close();    
  }
  
}
