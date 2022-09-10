package javaBasic.step11_conditional;
import java.util.Scanner;

// 월 입력받아 계절 출력하기
//입력 : 월을 의미하는 1개의 정수가 입력된다.(1 ~ 12)
//출력 : 계절 이름을 출력한다.
public class Ex70 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    switch(a) {
      case 12 :
      case 1 :
      case 2 : 
        System.out.println("winter");
        break;
      case 3 :
      case 4 :
      case 5 : 
        System.out.println("spring");
        break;
      case 6 :
      case 7 :
      case 8 : 
        System.out.println("summer");
        break;
      case 9 :
      case 10 :
      case 11 : 
        System.out.println("fall");
        break;
    }
    
    sc.close();    
  }
  
}
