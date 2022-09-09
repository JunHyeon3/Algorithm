package javaBasic.step5_operation;
import java.util.Scanner;

// 정수 3개 입력받아 합과 평균 출력하기
//입력 : 정수 3개가 공백을 두고 입력된다. 단, -2147483648 ~ +2147483647
//출력 : 합과 평균을 줄을 바꿔 출력한다. 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
public class Ex46 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    System.out.println(a+b+c);
    System.out.printf("%.1f", (float)(a+b+c)/3);
    
    sc.close();    
  }
  
}
