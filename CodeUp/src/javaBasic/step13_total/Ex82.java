package javaBasic.step13_total;
import java.util.Scanner;

// 16진수 구구단?
//입력 : 16진수로 한 자리 수가 입력된다. 단, A ~ F 까지만 입력된다.
//출력 : 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다. 계산 결과도 16진수로 출력해야 한다.
public class Ex82 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt(16);
    
    for(int i=1; i<16; i++) {
      System.out.printf("%H*%H=%H\n", a, i, a*i);
    }
    
    sc.close();    
  }
  
}
