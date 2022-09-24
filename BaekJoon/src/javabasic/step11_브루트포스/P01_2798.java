package javabasic.step11_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
// 입력 : 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 
//       둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
// 출력 : 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
public class P01_2798 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        st =new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum = 0;
        int result = 0;
        
        for(int i=0; i<arr.length-2; i++) {
            for(int j=i+1; j<arr.length-1; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    
                    if(sum == M) {
                        result = sum;
                    }
                    
                    if(sum < M && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        
        System.out.print(result);
    }
    
}

// 브루트 포스란 발생할 수 있는 모든 경우를 무식하게 탐색한다는 뜻이며, 전체 탐색, 완전 탐색이라고도 한다.
// 해가 하나 이상 존재한다는 가정으로 모든 범위를 탐색하기 때문에 100% 정답을 찾는다.

// 장점
// 알고리즘 설계와 구현이 매우 쉽다.
// 복잡하지 않고 빠르게 구현할 수 있다.

//단점
//실행 시간이 오래 걸린다.
//메모리 효율면에서 비효율적이다.

//브루트 포스의 종류
//선형 구조 : 순차 탐색
//비선형 구조 : 백트래킹, DFS, BFS