package javabasic.step11_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숌이 만든 N번째 영화의 제목에 들어간 숫자를 출력하는 프로그램을 작성하시오. 숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.
// 입력 : 첫째 줄에 숫자 N이 주어진다. N은 10,000보다 작거나 같은 자연수이다.
// 출력 : 첫째 줄에 N번째 영화의 제목에 들어간 수를 출력한다.
public class P05_1436 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 1;
        int movie = 666;
        
        while(true) {
            if(count == N) {
                break;
            }
            
            movie++;
            
            if(String.valueOf(movie).contains("666")) {
                count++;
            }
            
        }
        
        System.out.print(movie);
    }
    
}
