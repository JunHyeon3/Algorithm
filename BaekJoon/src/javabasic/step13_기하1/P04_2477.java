package javabasic.step13_기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 1m2의 넓이에 자라는 참외의 개수와, 참외밭을 이루는 육각형의 임의의 한 꼭짓점에서 출발하여 
 * 반시계방향으로 둘레를 돌면서 지나는 변의 방향과 길이가 순서대로 주어진다. 
 * 이 참외밭에서 자라는 참외의 수를 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫 번째 줄에 1m2의 넓이에 자라는 참외의 개수를 나타내는 양의 정수 K (1 ≤ K ≤ 20)가 주어진다. 
 * 참외밭을 나타내는 육각형의 임의의 한 꼭짓점에서 출발하여 반시계방향으로 둘레를 돌면서 지나는 변의 방향과 
 * 길이 (1 이상 500 이하의 정수) 가 둘째 줄부터 일곱 번째 줄까지 한 줄에 하나씩 순서대로 주어진다. 
 * 변의 방향에서 동쪽은 1, 서쪽은 2, 남쪽은 3, 북쪽은 4로 나타낸다.
 * [출력]
 * 첫째 줄에 입력으로 주어진 밭에서 자라는 참외의 수를 출력한다.
 */

public class P04_2477 { 
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int K = Integer.parseInt(br.readLine());
        
        int width_max = 0, width_max_index = 0;
        int height_max = 0, height_max_index = 0;
        
        int[] direction = new int[6];
        int[] length = new int[6];
            
        for (int i=0; i<6; i++) {
            st = new StringTokenizer(br.readLine());
            
            direction[i] = Integer.parseInt(st.nextToken());
            length[i] = Integer.parseInt(st.nextToken());
            
            // 가로 방향일 경우
            if (direction[i] == 1 || direction[i] == 2) {
                if (length[i] > width_max) {
                    // 가로변의 길이가 최대인 값을 저장
                    width_max = length[i];
                    // 최대길이일 때의 인덱스 값을 저장
                    width_max_index = i;
                }
            }
            // 세로 방향일 경우
            else {
                if (length[i] > height_max) {
                    // 세로변의 길이가 최대인 값을 저장
                    height_max = length[i];
                    // 최대길이일 때의 인덱스 값을 저장
                    height_max_index = i;
                }
            }
        }

        int big_square = width_max * height_max;
        // 가로와 세로 각각의 가장 긴 변 이후 3번째에 나오는 변의 길이가 잘려나간 사각형의 변의 길이가 된다.
        int small_square = length[(width_max_index + 3) % 6] * length[(height_max_index + 3) % 6];
        
        System.out.println(K * (big_square - small_square));
    }

}