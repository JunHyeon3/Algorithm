package javaBasic.step14_array;
import java.util.Scanner;

// 바둑알 십자 뒤집기
//입력 : 바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다.
//      십자 뒤집기 횟수(n)가 입력된다.
//      십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.
//출력 : 십자 뒤집기 결과를 출력한다.
public class Ex97 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[][] a = new int[19][19];
    
    for(int i=0; i<19; i++) {
      for(int j=0; j<19; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    
    int n = sc.nextInt();
    
    for(int i=0; i<n; i++) {
      int x = sc.nextInt()-1;
      int y = sc.nextInt()-1;
      
      for(int j=0; j<a.length; j++) {
        if(a[x][j] == 1) a[x][j] = 0;
        else a[x][j] = 1;
        
        if(a[j][y] == 1) a[j][y] = 0;
        else a[j][y] = 1;
      }
    }
    
    for(int i=0; i<19; i++) {
      for(int j=0; j<19; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    
    sc.close();    
  }
  
}
