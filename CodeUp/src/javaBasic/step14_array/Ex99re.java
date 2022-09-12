package javaBasic.step14_array;
import java.util.Scanner;

// 성실한 개미
//입력 : 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.
//출력 : 성실한 개미가 이동한 경로를 9로 표시해 출력한다.
public class Ex99re {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[][] a = new int[11][11];
    int x = 2;
    int y = 2;
    
    for(int i=1; i<=10; i++) {
      for(int j=1; j<=10; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    
    while(true) {
      if(a[x][y] == 0) {
        a[x][y] = 9;
        y++;
      }
      
      if(a[x][y] == 1) {
        y--;
        x++;
      }
      
      if(a[x][y] == 2) {
        a[x][y] = 9;
        break;
      }
      else if(a[x][y+1] == 1 && a[x+1][y] == 1) {
        if(a[x][y] == 0) 
          a[x][y] = 9;
        break;
      }
    }
    
    for(int i=1; i<=10; i++) {
      for(int j=1; j<=10; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    
    sc.close();    
  }
  
}
