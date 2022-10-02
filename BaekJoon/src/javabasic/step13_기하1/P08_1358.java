package javabasic.step13_기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 하키 링크는 (X, Y)가 가장 왼쪽 아래 모서리인 W * H 크기의 직사각형과, 
 * 반지름이 H/2이면서 중심이 (X, Y+R), (X+W, Y+R)에 있는 두 개의 원으로 이루어져 있다. 
 * 선수들의 위치가 주어질 때, 링크 안 또는 경계에 있는 선수가 총 몇 명인지 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 수 W H X Y P가 주어진다. P는 선수의 수이다. W와 H는 100보다 작거나 같은 자연수이고, H는 짝수이다. 
 * X와 Y는 절댓값이 100보다 작거나 같은 정수이다. P는 최대 50인 자연수이다. 
 * 둘째 줄부터 P개의 줄에 각 선수들의 x좌표와 y좌표가 주어진다. 이 좌표는 절댓값이 300보다 작거나 같은 정수이다.
 * [출력]
 * 첫째 줄에 링크 안에 있는 선수의 수를 출력한다.
 */

public class P08_1358 { 
    
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        int count = 0;
        
        for (int i=0; i<P; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	int player_x = Integer.parseInt(st.nextToken());
        	int player_y = Integer.parseInt(st.nextToken());
        	
        	
        	if (Math.pow(player_x-X, 2) + Math.pow(player_y-(Y+H/2), 2) <= Math.pow(H/2, 2) && player_x < X) {
        		count++;
        	}
        	else if (player_x >= X && player_x <= X+W && player_y >= Y && player_y <= Y+H) {
        		count++;
        	}
        	else if (Math.pow(player_x-(X+W), 2) + Math.pow(player_y-(Y+H/2), 2) <= Math.pow(H/2, 2) && player_x > X+W) {
        		count++;
        	}
        	
        }
        
        System.out.println(count);
    }
    
}