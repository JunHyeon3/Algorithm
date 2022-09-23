package javabasic.step10_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N개의 서로 다른 양의 정수가 저장된 배열 A가 있다. 병합 정렬로 배열 A를 오름차순 정렬할 경우 배열 A에 K 번째 저장되는 수를 구하기
// 입력 : 첫째 줄에 배열 A의 크기 N(5 ≤ N ≤ 500,000), 저장 횟수 K(1 ≤ K ≤ 108)가 주어진다.
//       다음 줄에 서로 다른 배열 A의 원소 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 109)
// 출력 : 배열 A에 K 번째 저장 되는 수를 출력한다. 저장 횟수가 K 보다 작으면 -1을 출력한다.
public class P04_24060_TO {
  
  // 임시로 사용하는 tmp 배열을 재귀함수안에서 선언하여 시간이 낭비되었다.
  // 배열을 전역변수로 선언하고 main에서 merge_sort를 호출하기전에 객체를 생성하여 시간초과 문제를 해결하였다.
  static int[] A, tmp;
  static int K;  
  static int count = 0;  
  static int result = -1;  
    
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      st = new StringTokenizer(br.readLine());
      
      int N = Integer.parseInt(st.nextToken());
      K = Integer.parseInt(st.nextToken());
      
      A = new int[N];
      
      st = new StringTokenizer(br.readLine());
      
      for(int i=0; i<N; i++) {
          A[i] = Integer.parseInt(st.nextToken());
      }
      
      tmp = new int[N];
      
      merge_sort(A, 0, A.length-1);
      
      System.out.print(result);
  }
  
  public static void merge_sort(int arr[], int left, int right) {
      if(left == right) {
          return;
      }
      
      int mid = (left + right) / 2;
      
      
      merge_sort(arr, left, mid);
      merge_sort(arr, mid + 1, right);
      
      merge(arr, left, right);
  }

  
  public static void merge(int arr[], int left, int right) {
      int l, r, k, a;
      int m = (left + right) / 2;
      
      l = left;
      r = m + 1;
      k = left;
      
      while(l <= m && r <= right) {
          tmp[k++] = (arr[l] <= arr[r])? arr[l++] : arr[r++];
      }
      
      if(l > m) {
          for(a=r; a<=right; a++) {
              tmp[k++] = arr[a];
          }
      }
      else {
          for(a=l; a<=m; a++) {
              tmp[k++] = arr[a];
          }
      }

      for(a=left; a<=right; a++) {
          count++;
          if(count == K) {
              result = tmp[a];
              return;
          }
          arr[a] = tmp[a];
      }
      
  }
  
}
