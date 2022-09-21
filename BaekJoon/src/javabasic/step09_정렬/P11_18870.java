package javabasic.step09_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다. 
// Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.
// (작은 X값 부터 0~ 순위를 매긴다.)
// 입력 : 첫째 줄에 N이 주어진다. 둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다
// 출력 : 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
public class P11_18870 {
  
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();
      
      int N = Integer.parseInt(br.readLine());
      
      int[] arr = new int[N];
      int[] sort = new int[N];
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      
      st = new StringTokenizer(br.readLine());
      
      for(int i=0; i<N; i++) {
          arr[i] = sort[i] = Integer.parseInt(st.nextToken());
      }
      
      Arrays.sort(sort);
      
      
      int count = 0;
      
      for(int i=0; i<sort.length; i++) {
          // 중복되는 key값이 없을 경우
          if(!map.containsKey(sort[i])) {
              map.put(sort[i], count);
              count++;
          }
      }
      
      for(int i=0; i<arr.length; i++) {
          int result = map.get(arr[i]);
          sb.append(result).append(" ");
      }
      
      System.out.print(sb);
      
  }
  
}


// HashMap<키, 밸류값> 클래스
// 중복된 키로는 값을 저장할 수 없다. 같은 값을 다른 키로 저장하는 것은 가능
//메소드
//containsKey(Object key) : 해당 맵이 전달된 키를 가지고 있는지 확인 후 boolean 값 반환
//get(Object key) : 해당 맵에서 전달된 키에 대응하는 값을 반환, 값을 포함하고 있지 않으면 null을 반환
//put(K key, V value) : 해당 맵에 전달된 키에 대응하는 값으로 특정 값을 매핑함.
