package javaBasic.step14_array;
import java.util.Scanner;

// 바둑판에 흰 돌 놓기
//입력 : 바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
//      둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
//      n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.
//출력 : 흰 돌이 올려진 바둑판의 상황을 출력한다.
//      흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다
public class Ex96 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[][] a = new int[19][19];
    
    for(int i=0; i<n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      a[x-1][y-1] = 1;
    }
    
    for(int i=0; i<19; i++) {
      for(int j=0; j<19; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println(" ");
    }
    
    sc.close();    
  }
  
}
