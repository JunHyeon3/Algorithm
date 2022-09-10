package javaBasic.step11_conditional;
import java.util.Scanner;

// 정수 1개 입력받아 분석하기
//입력 : 정수 1개가 입력된다. -2147483648 ~ +2147483647, 단 0은 입력되지 않는다.
//출력 : 입력된 정수에 대해 첫 줄에 minus 나 plus 를 출력하고, 두 번째 줄에 odd 나 even 을 출력한다.
public class Ex67 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    if(a>0)
      System.out.println("plus");
    else
      System.out.println("minus");
    if(a%2 == 0)
      System.out.println("even");
    else
      System.out.println("odd");
    
    sc.close();    
  }
  
}
