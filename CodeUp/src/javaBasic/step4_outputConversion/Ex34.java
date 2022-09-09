package javaBasic.step4_outputConversion;
import java.util.Scanner;

//8진 정수 1개 입력받아 10진수로 출력하기
//입력 : 8진 정수 1개가 입력된다.
//출력 : 10진수로 바꾸어 출력한다.
public class Ex34 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //nextInt의 괄호안에 원하는 진법을 입력하면 해당 진법으로 값을 입력받음
    int a = sc.nextInt(8);
    
    System.out.printf("%d", a);
    
    sc.close();    
  }
  
}
