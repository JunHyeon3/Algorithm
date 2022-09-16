package javabasic.step01_입출력과사칙연산;
import java.util.*;

// 1998년생인 내가 태국에서는 2541년생?!
//입력 : 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
//출력 : 불기 연도를 서기 연도로 변환한 결과를 출력한다.
public class P09_18108 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int Y = sc.nextInt();
    
    System.out.println(Y-543);
    
    sc.close();
  }
  
}
