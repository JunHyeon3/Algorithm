package javaBasic.step5_operation;
import java.util.Scanner;

// 정수 2개 입력받아 나눈 몫 출력하기
//입력 : 정수 2개(a, b)가 공백을 두고 입력된다. 단, -2147483648 <= a <= b <= +2147483647
//출력 : a를 b로 나눈 몫을 출력한다.
public class Ex42 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    long b = sc.nextLong();
    
    System.out.printf("%d", a/b);
    
    sc.close();    
  }
  
}
