package javaBasic.step14_array;
import java.util.Scanner;

// 이상한 출석 번호 부르기1
//입력 : 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000) 두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
//출력 : 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
public class Ex93 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] a= new int[23];
    int n = sc.nextInt();
    
    for(int i=0; i<n; i++) {
      int b = sc.nextInt();
      a[b-1]++;
    }
    
    for(int i=0; i<a.length; i++) {
      System.out.print(a[i] + " ");
    }
    
    sc.close();    
  }
  
}
