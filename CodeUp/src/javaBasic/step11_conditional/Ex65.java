package javaBasic.step11_conditional;
import java.util.Scanner;

// 정수 3개 입력받아 짝수만 출력하기
//입력 : 세 정수 a, b, c 가 공백을 두고 입력된다. 0 ~ +2147483647 범위의 정수들이 입력되며 적어도 1개는 짝수이다.
//출력 : 짝수만 순서대로 줄을 바꿔 출력한다.
public class Ex65 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if(a%2 == 0)
      System.out.println(a);
    if(b%2 == 0)
      System.out.println(b);
    if(c%2 == 0)
      System.out.println(c);
    
    sc.close();    
  }
  
}
