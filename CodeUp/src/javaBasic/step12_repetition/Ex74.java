package javaBasic.step12_repetition;
import java.util.Scanner;

// 정수 1개 입력받아 카운트다운 출력하기1
//입력 : 정수 1개가 입력된다. (1 ~ 100)
//출력 : 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다.
public class Ex74 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    for(int i=0; ;i++) {
      System.out.println(a);

      if(a==1) break;
      
      a--;
    }
    
    sc.close();    
  }
  
}
