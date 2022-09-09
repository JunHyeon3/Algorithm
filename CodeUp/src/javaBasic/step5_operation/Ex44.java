package javaBasic.step5_operation;
import java.util.Scanner;

// 정수 1개 입력받아 1 더해 출력하기
//입력 : 정수 1개가 입력된다. 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
//출력 : 입력된 정수에 1을 더해 출력한다.
public class Ex44 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    System.out.println((long)a+1);
    
    sc.close();    
  }
  
}
