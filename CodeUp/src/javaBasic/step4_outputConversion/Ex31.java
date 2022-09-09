package javaBasic.step4_outputConversion;
import java.util.Scanner;

//10진 정수 1개 입력받아 8진수로 출력하기
//입력 : 10진수 1개가 입력된다. 단, 입력되는 정수는 int 범위이다.
//출력 : 8진수로 출력한다.
public class Ex31 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    System.out.printf("%o", a);
    
    sc.close();    
  }
  
}
