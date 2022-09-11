package javaBasic.step13_total;
import java.util.Scanner;

// 수 나열하기3
//입력 : 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)
//출력 : n번째 수를 출력한다.
public class Ex91 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int m = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();
    long result = a;
    
    for(int i=1; i<n; i++) {
      result = result * m + d;
    }
    
    System.out.println(result);
    
    sc.close();    
  }
  
}
