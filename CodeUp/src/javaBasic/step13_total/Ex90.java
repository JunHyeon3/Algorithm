package javaBasic.step13_total;
import java.util.Scanner;

// 수 나열하기2
//입력 : 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 10)
//출력 : n번째 수를 출력한다.
public class Ex90 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextInt();
    int r = sc.nextInt();
    int n = sc.nextInt();
    
    for(int i=1; i<=n-1; i++) {
      a *= r;
    }
    
    System.out.println(a);
    
    sc.close();    
  }
  
}
