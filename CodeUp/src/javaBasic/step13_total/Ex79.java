package javaBasic.step13_total;
import java.util.Scanner;

// 원하는 문자가 입력될 때까지 반복 출력하기
//출력 : 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
public class Ex79 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(true) {
      char a = sc.next().charAt(0);
      
      System.out.println(a);
      
      if(a=='q') break;
      
    }
    
    sc.close();    
  }
  
}
