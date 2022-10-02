package javabasic.step13_기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [문제]
 * 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 
 * 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 
 * 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
 * 한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. (-10,000 <= x1, y1, x2, y2 <= 10,000인 정수, r1, r2는 10,000보다 작거나 같은 자연수이다.
 * [출력]
 * 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 
 * 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
 */

public class P06_1002_RE { 
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        int x1 = 0, y1 = 0, r1 = 0, x2 = 0, y2 = 0, r2 = 0;
        
        int location_count = 0;
        
        for (int i=0; i<T; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	x1 = Integer.parseInt(st.nextToken());
        	y1 = Integer.parseInt(st.nextToken());
        	r1 = Integer.parseInt(st.nextToken());
        	
        	x2 = Integer.parseInt(st.nextToken());
        	y2 = Integer.parseInt(st.nextToken());
        	r2 = Integer.parseInt(st.nextToken());

        	if (x1 == x2 && y1 == y2 && r1 == r2) {
        		location_count = -1;
        	}
        	else if ((Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) > Math.pow(r1+r2, 2) || (Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) < Math.pow(r1-r2, 2)) {
        		location_count = 0;
        	}
        	else if ((Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) == Math.pow(r1-r2, 2) || (Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) == Math.pow(r1+r2, 2)) {
        		location_count = 1;
        	}
        	else {
				location_count = 2;
			}
        	
        	System.out.println(location_count);
        }
    }
}

/* 
 * [류재명의 위치는 주어진 두 원의 접점]
 * 1. 접점이 무한대
 * 		1-1. 두 원이 일치 : 두 원의 중심과 반지름이 일치
 * 2. 접점이 0개
 * 		2-1. 두 원이 서로 떨어져 있을 때 : 두 원점 사이의 거리 > 두 원의 반지름 합
 * 		2-2. 두 원이 안에서 서로 떨어져 있을 때 : 두 원점 사이의 거리 < 두 원의 반지름 차이
 * 3. 접점이 1개
 * 		3-1. 두 원이 내접 할 때 : 두 원점 사이의 거리 = 두 원의 반지름 차이 
 * 		3-2. 두 원이 외접 할 때 : 두 원점 사이의 거리 = 두 원의 반지름 합
 * 4. 접점이 2개
 * 		4-1. 위 의 경우를 제외한 모두
 */

