package javaBasic.step12_repetition;
import java.util.Scanner;

// 정수 1개 입력받아 그 수까지 출력하기
//입력 : 정수 1개가 입력된다. (0 ~ 100)
//출력 : 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
public class Ex77 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b=0;
    
    for(int i=0; i<a+1; i++) {
      System.out.println(0+b);
      b++;
    }
    
    sc.close();    
  }
  
}
