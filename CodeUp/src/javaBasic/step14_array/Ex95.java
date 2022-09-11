package javaBasic.step14_array;
import java.util.Scanner;

// 이상한 출석 번호 부르기3
//입력 : 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다. n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
//출력 : 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
public class Ex95 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] k = new int[n];
    int result = 23;
    
    for(int i=0; i<n; i++) {
      k[i] = sc.nextInt();
      
      if(k[i] <= result) {
        result = k[i];
      }
    }
   
    System.out.println(result);
    
    sc.close();    
  }
  
}
