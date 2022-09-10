package javaBasic.step12_repetition;
import java.util.Scanner;

// 정수 입력받아 계속 출력하기
//입력 : 첫 줄에 정수의 개수 n이 입력되고, 두 번째 줄에 n개의 정수가 공백을 두고 입력된다.
//     -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
//출력 : n개의 정수를 한 개씩 줄을 바꿔 출력한다.
public class Ex72 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    for(int i=0; i<a; i++) {
      int b = sc.nextInt();
      System.out.println(b);
    }
    
    sc.close();    
  }
  
}
