package javabasic.step04_1차원배열;
import java.util.*;

// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//출력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
public class P02_2562 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] arr = new int[9];
    int max = 0;
    int count = 0;
    
    for(int i=0; i<9; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    for(int j=0; j<9; j++) {
      if( arr[j] > max) {
        max = arr[j];
        count = j + 1;
      }
    }
    
    System.out.println(max);
    System.out.println(count);
  }
  
}
