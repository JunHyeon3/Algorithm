package javabasic.step13_기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [문제]
 * 반지름 R이 주어졌을 때, 유클리드 기하학에서 원의 넓이와, 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하시오.
 * [입력]
 * 첫째 줄에 반지름 R이 주어진다. R은 10,000보다 작거나 같은 자연수이다.
 * [출력]
 * 첫째 줄에는 유클리드 기하학에서 반지름이 R인 원의 넓이를, 둘째 줄에는 택시 기하학에서 반지름이 R인 원의 넓이를 출력한다. 
 * 정답과의 오차는 0.0001까지 허용한다.
 */

public class P05_3053 { 
    
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int R = Integer.parseInt(br.readLine());
        
        // 유클리드 기하학 원의 넓이 공식 : pi * r^2
        System.out.printf("%.6f \n", Math.PI * Math.pow(R, 2));       
       
        // 택시 기하학에서의 원은 중심이 원점에 있고, x,y축 상에서 원점부터 반지름 만큼 떨어져 있는 곳에 꼭지점이 있는 마름모 형태이다. 
        // 따라서, 택시 기하학에서의 원의 넓이(마름모의 넓이)는 2 * r^2 으로 표현할 수 있다.
        System.out.printf("%.6f", 2 * Math.pow(R, 2));       
    }
    
}