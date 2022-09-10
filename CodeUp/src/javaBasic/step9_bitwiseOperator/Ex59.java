package javaBasic.step9_bitwiseOperator;
import java.util.Scanner;

// 비트단위로 NOT 하여 출력하기
//입력 : 정수 1개가 입력된다. -2147483648 ~ +2147483647
//출력 : 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
public class Ex59 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    System.out.println(~a);
    
    sc.close();    
  }
  
}
