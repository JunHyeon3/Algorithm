package javabasic.step11_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다. 
//       둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.
// 출력 : 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
public class P04_1018 {
    
    public static Boolean[][] arr;
    public static int min = 32;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        arr = new Boolean[N][M];
     
        //arr[][] 배열에 주어진 체스판을 입력, B이면 false, W이면 true
        for(int i=0; i<N; i++) {
            String S = br.readLine();
            
            for(int j=0; j<M; j++) {
                if(S.charAt(j) == 'B') {
                    arr[i][j] = false;
                }
                else {
                    arr[i][j] = true;
                }
            }
        }
        
        // 0~N-7 까지 반복하면서 최소인 수를 찾는다.
        for(int i=0; i<N-7; i++) {
            for(int j=0; j<M-7; j++) {
                min = Math.min(find(i,j), min);
            }
        }

        System.out.print(min);
    }
    
    public static int find(int x, int y) {
        // 다시 칠해야 하는 정사각형의 개수를 세는 변수
        int count = 0;
        
        // 8x8 체스판의 시작 점의 색을 기억
        boolean first = arr[x][y];
        
        for(int i=x; i<x+8; i++) {
            for(int j=y; j<y+8; j++) {
                //i,j 번째와 첫 번째 좌표 값을 비교하여 다르면 다시 칠한다. 
                if(arr[i][j] != first) {
                    count++;
                }
                
                // 한칸이 지나면 색이 반대로 바뀌므로 first 값도 반대로 바꾼다.
                first = !first;
            }
            
            // 한줄이 지나가 시작점의 색이 바뀌므로 first 값을 반대로 바꾼다.
            first = !first;
        }
        
        // 기존의 시작점의 색으로 했을때의 개수 count 와 
        // 시작점의 색을 반대로 했을때의 개수 64-count 값을 비교하여 최소값을 리턴한다.
        return Math.min(count, 64-count);
    }
}
