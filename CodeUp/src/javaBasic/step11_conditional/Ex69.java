package javaBasic.step11_conditional;
import java.util.Scanner;

// 평가 입력받아 다르게 출력하기
//입력 : 영문자 1개가 입력된다. (A, B, C, D 등의 한 문자가 입력된다.)
//출력 : 평가내용에 따라 다른 내용이 출력된다.
public class Ex69 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char a = sc.next().charAt(0);
    
    switch(a) {
      case 'A' : 
        System.out.println("best!!!");
        break;
      case 'B' : 
        System.out.println("good!!");
        break;
      case 'C' : 
        System.out.println("run!");
        break;
      case 'D' : 
        System.out.println("slowly~");
        break;
      default : 
        System.out.println("what?");        
        break;
    }
    
    sc.close();    
  }
  
}
