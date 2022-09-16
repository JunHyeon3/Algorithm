package javabasic.step01_입출력과사칙연산;
import java.util.*;

// 빈 칸에 들어갈 수는?
//입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
public class P12_2558 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    String B = sc.next();
    String[] C = B.split("");
    
    System.out.println(A * Integer.parseInt(C[2]));
    System.out.println(A * Integer.parseInt(C[1]));
    System.out.println(A * Integer.parseInt(C[0]));
    System.out.println(A * Integer.parseInt(B));
    
    sc.close();
  }
  
}
