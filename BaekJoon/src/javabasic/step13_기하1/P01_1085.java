package javabasic.step13_기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 
 * 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 x, y, w, h가 주어진다.
 * [출력]
 * 첫째 줄에 문제의 정답을 출력한다.
 */

public class P01_1085 { 
    
    public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        int xMin = x > (w-x) ? (w-x) : x;
        int yMin = y > (h-y) ? (h-y) : y;
        
        int min = xMin > yMin ? yMin : xMin;
        
        System.out.println(min);
    }
    
}