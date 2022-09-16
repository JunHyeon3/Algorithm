package javabasic.step01_입출력과사칙연산;
import java.util.*;

// 모든 연산 문제
public class P07_10869 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    System.out.println(A+B);
    System.out.println(A-B);
    System.out.println(A*B);
    System.out.println(A/B);
    System.out.println(A%B);
    
    sc.close();
  }
  
}
