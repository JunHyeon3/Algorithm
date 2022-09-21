package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
// 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
public class P01_2750 {
  
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      int[] arr = new int[N];
      
      for(int i=0; i<N; i++) {
          arr[i] = Integer.parseInt(br.readLine());
      }
//방법 1
      Arrays.sort(arr);
      
//방법 2
//      for(int i=0; i<N-1; i++) {
//          for(int j=i+1; j<N; j++) {
//              if(arr[i] > arr[j]) {
//                  int a = arr[i];
//                  arr[i] = arr[j];
//                  arr[j] = a;
//              }
//          }
//      }
      
      for(int i : arr) {
          System.out.println(i);
      }
  }
  
}
