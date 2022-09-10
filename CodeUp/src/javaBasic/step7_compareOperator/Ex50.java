package javaBasic.step7_compareOperator;
import java.util.Scanner;

// 두 정수 입력받아 비교하기2
//입력 : 두 정수 a, b가 공백을 두고 입력된다. -2147483648 <= a, b <= +2147483647
//출력 : a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
public class Ex50 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a==b)
      System.out.println(1);
    else
      System.out.println(0);
    
    sc.close();    
  }
  
}
