package javaBasic.step13_total;
import java.util.Scanner;

// 3 6 9 게임의 왕이 되자!
//입력 : 10 보다 작은 정수 1개가 입력된다. (1 ~ 9)
//출력 : 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데, 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다
public class Ex83 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    for(int i=1; i<=a; i++) {
      if(i==3 || i==6 || i==9) {
        System.out.printf("%s ", "X");
      }
      else {
        System.out.printf("%d ", i);
      }
    }
    
    sc.close();    
  }
  
}
