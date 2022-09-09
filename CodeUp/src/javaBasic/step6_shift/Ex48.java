package javaBasic.step6_shift;
import java.util.Scanner;

// 한 번에 2의 거듭제곱 배로 출력하기
//입력 : 정수 2개가 공백을 두고 입력된다. 0 <= a, b <= 10
//출력 : a 를 2b배 만큼 곱한 값을 출력한다.
public class Ex48 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println(a<<b);
    
    sc.close();    
  }
  
}
