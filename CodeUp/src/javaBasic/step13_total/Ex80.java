package javaBasic.step13_total;
import java.util.Scanner;

// 언제까지 더해야 할까?
//입력 : 정수 1개가 입력된다.
//출력 : 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가, 
//      입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
public class Ex80 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int sum = 0;
    
    for(int i=1;  ;i++) {
      sum += i;
      
      if(sum >= a) {
        System.out.println(i);
        break;      
      }
      
    }
    
    sc.close();    
  }
  
}
