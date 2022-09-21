package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 산술평균 : N개의 수들의 합을 N으로 나눈 값
// 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
// 최빈값 : N개의 수들 중 가장 많이 나타나는 값
// 범위 : N개의 수들 중 최댓값과 최솟값의 차이
// 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
// 출력 : 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
//       둘째 줄에는 중앙값을 출력한다.
//       셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
//       넷째 줄에는 범위를 출력한다.
public class P05_2108 {
  
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      
      int[] arr = new int[N];
      int[] counting = new int[8001];
  
      double sum = 0;
      int max = -4000;
      int min = 4000;
      
      for(int i=0; i<N; i++) {
          int value = Integer.parseInt(br.readLine());
          
          arr[i] = value;
          counting[value + 4000]++;
          
          sum += value;
          
          if(value > max) {
              max = value;
          }
          if(value < min) {
              min = value;
          }
          
      }
      
//      중앙값
      int center = 0;

      Arrays.sort(arr);
      
      center = arr[N/2];
      
//      최빈값(카운팅정렬)
      int frequency_count = 0;
      int frequency = 0;
      boolean check = false;
      
      for(int i=0; i<counting.length; i++) {
          if(counting[i] > 0) {
              if(counting[i] > frequency_count) {
                  frequency_count = counting[i];
                  frequency = i - 4000;
                  check = true;
              }
              else if(counting[i] == frequency_count && check == true) {
                  frequency = i - 4000;
                  check = false;
              }
          }
      }
      
      System.out.println(Math.round(sum/N));
      System.out.println(center);
      System.out.println(frequency);
      System.out.println(max - min);
  }
  
}
