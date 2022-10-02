package javabasic.step13_기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 은하수 지도, 출발점, 도착점이 주어졌을 때 어린 왕자에게 필요한 최소의 행성계 진입/이탈 횟수를 구하는 프로그램을 작성해 보자.
 * 행성계의 경계가 맞닿거나 서로 교차하는 경우는 없다. 또한, 출발점이나 도착점이 행성계 경계에 걸쳐진 경우 역시 입력으로 주어지지 않는다.
 * [입력]
 * 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 그 다음 줄부터 첫째 줄에 출발점 (x1, y1)과 도착점 (x2, y2)이 주어진다. 
 * 두 번째 줄에는 행성계의 개수 n이 주어지며, 세 번째 줄부터 n줄에 걸쳐 행성계의 중점과 반지름 (cx, cy, r)이 주어진다.
 * [출력]
 * 각 테스트 케이스에 대해 어린 왕자가 거쳐야 할 최소의 행성계 진입/이탈 횟수를 출력한다.
 */

public class P07_1004_RE { 
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int test_case = Integer.parseInt(br.readLine());
        
        
        for (int i=0; i<test_case; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	int start_x = Integer.parseInt(st.nextToken());
        	int start_y = Integer.parseInt(st.nextToken());
        	
        	int end_x = Integer.parseInt(st.nextToken());
        	int end_y = Integer.parseInt(st.nextToken());

        	int planet_number = Integer.parseInt(br.readLine());
        	
        	int count = 0;
            
            for (int j=0; j<planet_number; j++) {
            	st = new StringTokenizer(br.readLine());
            	
            	int planet_x = Integer.parseInt(st.nextToken()); 
            	int planet_y = Integer.parseInt(st.nextToken()); 
            	int planet_r = Integer.parseInt(st.nextToken()); 
            	
            	if ((Math.pow(start_x-planet_x, 2) + Math.pow(start_y-planet_y, 2)) < Math.pow(planet_r, 2) && (Math.pow(end_x-planet_x, 2) + Math.pow(end_y-planet_y, 2)) < Math.pow(planet_r, 2)) {
            		continue;
            	}
            	else if ((Math.pow(start_x-planet_x, 2) + Math.pow(start_y-planet_y, 2)) < Math.pow(planet_r, 2) || (Math.pow(end_x-planet_x, 2) + Math.pow(end_y-planet_y, 2)) < Math.pow(planet_r, 2)) {
            		count++;
            	}
            }
            
            System.out.println(count);
        }
        

    }
    
}