package javaBasic.step11_conditional;
import java.util.Scanner;

// 정수 3개 입력받아 짝/홀 출력하기
//입력 : 세 정수 a, b, c 가 공백을 두고 입력된다. 0 <= a, b, c <= +2147483647
//출력 : 입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다
public class Ex66 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if(a%2 == 0)
      System.out.println("even");
    else
      System.out.println("odd");
    if(b%2 == 0)
      System.out.println("even");
    else
      System.out.println("odd");
    if(c%2 == 0)
      System.out.println("even");
    else
      System.out.println("odd");
      
    sc.close();    
  }
  
}
