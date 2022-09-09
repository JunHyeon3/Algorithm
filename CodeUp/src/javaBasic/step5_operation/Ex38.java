package javaBasic.step5_operation;
import java.util.Scanner;

// 정수 2개 입력받아 합 출력하기1
//입력 : 2개의 정수가 공백으로 구분되어 입력된다. 주의 : 계산의 결과가 int 범위를 넘어가는지를 잘 생각해 보아야 한다.
//출력 : 두 정수의 합을 출력한다.
public class Ex38 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.printf("%d", (long)a+b);
    sc.close();    
  }
  
}
