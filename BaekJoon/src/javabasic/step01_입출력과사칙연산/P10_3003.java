package javabasic.step01_입출력과사칙연산;
import java.util.*;

// 킹, 퀸, 룩, 비숍, 나이트, 폰
//입력 : 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다
//출력 : 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
public class P10_3003 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int king = sc.nextInt();
    int queen = sc.nextInt();
    int rook = sc.nextInt();
    int bishop = sc.nextInt();
    int knight = sc.nextInt();
    int pawn = sc.nextInt();
    
    System.out.print(1-king + " ");
    System.out.print(1-queen + " " );
    System.out.print(2-rook + " " );
    System.out.print(2-bishop + " " );
    System.out.print(2-knight + " " );
    System.out.print(8-pawn);
    
    sc.close();
  }
  
}
