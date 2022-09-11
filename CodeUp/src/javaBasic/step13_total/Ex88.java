package javaBasic.step13_total;
import java.util.Scanner;

// 3의 배수는 통과?
//입력 : 정수 1개를 입력받는다. (1 ~ 100)
//출력 : 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되 3의 배수는 출력하지 않는다.

public class Ex88 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    for(int i=1; i<=a ;i++) {
      if(i%3 != 0) {
        System.out.println(i);
      }
    }
    
    sc.close();    
  }
  
}
