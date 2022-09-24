package javabasic.step11_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력해야 한다.
// 입력 : 첫 줄에는 전체 사람의 수 N이 주어진다. N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가 하나의 공백을 두고 각각 나타난다.
// 출력 : 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다. 단, 각 덩치 등수는 공백문자로 분리되어야 한다.
public class P03_7568 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            
            //arr[i][0]에는 x 좌표를 저장, arr[i][1]에는 y좌표를 저장
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        
        for(int i=0; i<N; i++) {
            int count = 1;
            
            for(int j=0; j<N; j++) {
                // 같은 줄에 있는 값은 비교하지 않고 넘어간다.
                if(i == j) continue;
                
                // x좌표와 y좌표 둘다 비교하여 둘다 작은 경우에만 count를 증가 시킴
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    count++;
                }
            }
            
            sb.append(count).append(" ");
        }
        
        System.out.print(sb);
    }
    
}
