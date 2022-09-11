package javaBasic.step14_array;
import java.util.Scanner;

// 설탕과자 뽑기
//입력 : 첫 줄에 격자판의 세로(h), 가로(w) 입력, 두 번째 줄에 놓을 수 있는 막대의 개수(n), 세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력
//      1 <= w, h <= 100, 1 <= n <= 10, d = 0 or 1, 1 <= x <= 100-h, 1 <= y <= 100-w
//출력 : 모든 막대를 놓은 격자판의 상태를 출력한다. 막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다. 단, 각 숫자는 공백으로 구분하여 출력한다.

public class Ex98 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[][] a = new int[w][h];
    
    for(int i=0; i<n; i++) {
      int l = sc.nextInt();
      int d = sc.nextInt();
      int x = sc.nextInt()-1;
      int y = sc.nextInt()-1;
      
      for(int j=0; j<l; j++) {
        if(d == 0) {
          a[x][j+y] = 1;
        }

        else if(d == 1) {
          a[j+x][y] = 1;
        }
      }
    }
    
    for(int i=0; i<w; i++) {
      for(int j=0; j<h; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    
    sc.close();    
  }
  
}
