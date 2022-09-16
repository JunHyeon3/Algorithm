package javabasic.step02_조건문;
import java.util.*;

// 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
// 입력 : 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
// 출력 : 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
public class P4_14681 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    if(X > 0 && Y > 0)
      System.out.println("1");
    else if(X > 0 && Y < 0)
      System.out.println("4");
    else if(X < 0 && Y < 0)
      System.out.println("3");
    else
      System.out.println("2");
    
    sc.close();
  }
  
}
