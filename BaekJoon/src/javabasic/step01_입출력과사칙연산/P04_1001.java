package javabasic.step01_입출력과사칙연산;
import java.util.*;

// 두 수를 입력받고 뺄셈을 한 결과를 출력하는 문제
public class P04_1001 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    System.out.printf("%d", A - B);
    
    sc.close();
  }
  
}
