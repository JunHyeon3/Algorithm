package javaBasic.step12_repetition;
import java.util.Scanner;

// 0 입력될 때까지 무한 출력하기1
//입력 : 정수가 순서대로 입력된다. -2147483648 ~ +2147483647, 단 개수는 알 수 없다.
//출력 : 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다. (0은 출력하지 않는다.)
public class Ex71 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(true) {
      int a = sc.nextInt();
      
      if(a == 0) break;
      
      System.out.println(a);
    }
    
    sc.close();    
  }
  
}
