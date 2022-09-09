package javaBasic.step3_datatype;
import java.util.Scanner;

//정수 1개 입력받아 그대로 출력하기1
//입력 : 정수 1개가 입력된다.(단, 입력되는 정수의 범위는 0 ~ 4294967295 이다.)
//출력 : 입력된 정수를 그대로 출력한다.
public class Ex28 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    
    System.out.println(a);
    
    sc.close();
  }
  
}
