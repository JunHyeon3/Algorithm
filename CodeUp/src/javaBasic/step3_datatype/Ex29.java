package javaBasic.step3_datatype;
import java.util.Scanner;

//정수 1개 입력받아 그대로 출력하기2
//입력 : 소수점 아래 숫자가 11개 이하인 실수 1개가 입력된다.(단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
//출력 : 입력된 실수를 소수점 이하 11자리까지 반올림하여 출력한다.
public class Ex29 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextDouble();
    
    System.out.printf("%.11f", a);

    sc.close();

  }
  
}
