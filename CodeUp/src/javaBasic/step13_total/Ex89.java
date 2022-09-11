package javaBasic.step13_total;
import java.util.Scanner;

// 수 나열하기1
//입력 : 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 100)
//출력 : n번째 수를 출력한다.
public class Ex89 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();
    int result = a+d*(n-1);

    System.out.println(result);
    
    sc.close();    
  }
  
}
