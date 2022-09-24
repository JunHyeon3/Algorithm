package javabasic.step11_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
// 출력 : 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
public class P02_2231 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int result = 0;
        
        for(int i=N; i>=1; i--) {
            // sum은 각 자리수의 합, num은 i값을 저장해두는 변수
            int sum = 0;
            int num = i;
            
            while(true) {
                // sum에 1의 자리 수를 더함
                sum += num%10;
                // num을 10으로 나누어 1의 자리를 없앰
                num /= 10;

                if(num == 0) {
                    break;
                }
            }
            
            // i와 i의 각 자리수 합이 N과 같으면 그 때의 i값을 결과 값으로 지정
            if((i + sum) == N) {
                result = i;
            }
        }
        
        System.out.print(result);
    }
    
}
