package javaBasic.step6_shift;
import java.util.Scanner;

// 정수 1개 입력받아 2배 곱해 출력하기
//입력 : 정수 한 개가 입력된다. 단, -1073741824 ~ +1073741823
//출력 : 2배 곱한 정수를 출력한다.
public class Ex47 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    System.out.println(a<<1);
    
    sc.close();    
  }
  
}
