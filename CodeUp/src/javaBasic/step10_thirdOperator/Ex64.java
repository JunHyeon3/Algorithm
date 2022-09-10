package javaBasic.step10_thirdOperator;
import java.util.Scanner;

// 정수 3개 입력받아 가장 작은 수 출력하기
//입력 : 3개의 정수가 공백으로 구분되어 입력된다. -2147483648 ~ +2147483648
//출력 : 가장 작은 값을 출력한다.
public class Ex64 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    System.out.println(a>b?(b>c?c:b):(a>c?c:a));
    
    sc.close();    
  }
  
}