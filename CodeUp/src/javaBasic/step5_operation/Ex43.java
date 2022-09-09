package javaBasic.step5_operation;
import java.util.Scanner;

// 정수 2개 입력받아 나눈 나머지 출력하기
//입력 : 정수 2개(a, b)가 공백을 두고 입력된다. 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
//출력 : a 를 b로 나눈 나머지를 출력한다.
public class Ex43 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    long b = sc.nextLong();
    
    System.out.printf("%d", a%b);
    
    sc.close();    
  }
  
}
