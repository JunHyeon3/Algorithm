package javabasic.step02_조건문;
import java.util.*;

// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다
// 출력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
public class P3_2753 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    int Year = sc.nextInt();
    
    if((Year%4 == 0 && Year%100 != 0) || Year%400 == 0)
      System.out.println("1");
    else 
      System.out.println("0");
    
    sc.close();
  }
  
}
