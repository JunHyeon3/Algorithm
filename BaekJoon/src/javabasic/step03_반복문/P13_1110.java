package javabasic.step03_반복문;
import java.util.*;

// 더하기 사이클
//입력 : 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
//출력 : 첫째 줄에 N의 사이클 길이를 출력한다.
public class P13_1110 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int result = N;
    int count = 0;
    
    while(true) {
      N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
      
      count ++;
      
      if(result == N) break;
    }

    System.out.println(count);
    
    sc.close();
  }
  
}
