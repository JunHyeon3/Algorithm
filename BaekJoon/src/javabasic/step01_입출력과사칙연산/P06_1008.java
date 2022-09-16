package javabasic.step01_입출력과사칙연산;
import java.util.*;

// 나눗셈 문제
public class P06_1008 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    
    System.out.print(A/B);
    
    sc.close();
  }
  
}
