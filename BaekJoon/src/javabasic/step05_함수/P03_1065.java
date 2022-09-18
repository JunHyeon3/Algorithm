package javabasic.step05_함수;
import java.util.*;

// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
// 입력 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
// 출력 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
public class P03_1065 {

  public static int count_hansoo(int N){
    int count = 0;
    
    if(N<100) {
      count = N;
    }
    
    else {
      count = 99;
      
      for(int i=100; i<=N; i++) {
        if(((i/10/10) - (i/10%10)) == ((i/10%10) - (i%10))) {
          count++;
        }
      }
    }
    
    return count;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println(count_hansoo(sc.nextInt()));
    
    sc.close();
  }
  
}
