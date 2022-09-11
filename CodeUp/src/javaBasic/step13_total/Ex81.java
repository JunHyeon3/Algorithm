package javaBasic.step13_total;
import java.util.Scanner;

// 주사위를 2개 던지면?
//입력 : 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다. 단, n, m은 10이하의 자연수
//출력 : 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다. 첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.

public class Ex81 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    for(int i=1; i<=a; i++) {
      for(int j=1; j<=b; j++) {
        System.out.printf("%d %d\n",i,j);
      }
    }
    
    sc.close();    
  }
  
}
