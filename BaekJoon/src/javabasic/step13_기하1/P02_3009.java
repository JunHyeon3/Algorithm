package javabasic.step13_기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 * [입력]
 * 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
 * [출력]
 * 직사각형의 네 번째 점의 좌표를 출력한다.
 */

public class P02_3009 { 
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[][] arr = new int[4][2];
        
        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // x좌표 비교
        if(arr[0][0] == arr[1][0]) {
            arr[3][0] = arr[2][0];
        }
        else if(arr[0][0] == arr[2][0]) {
            arr[3][0] = arr[1][0];
        }
        else {
            arr[3][0] = arr[0][0];
        }
        
        // y좌표 비교
        if(arr[0][1] == arr[1][1]) {
            arr[3][1] = arr[2][1];
        }
        else if(arr[0][1] == arr[2][1]) {
            arr[3][1] = arr[1][1];
        }
        else {
            arr[3][1] = arr[0][1];
        }

        System.out.println(arr[3][0] + " " + arr[3][1]);
    }
    
}