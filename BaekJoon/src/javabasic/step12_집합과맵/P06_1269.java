package javabasic.step12_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 주어진다. 
//        둘째 줄에는 집합 A의 모든 원소가, 셋째 줄에는 집합 B의 모든 원소가 빈 칸을 사이에 두고 각각 주어진다. 
// 출력 : 첫째 줄에 대칭 차집합의 원소의 개수를 출력한다.
public class P06_1269 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 0;
        
        Set<Integer> A_set = new HashSet<>();
        Set<Integer> B_set = new HashSet<>();
        
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++) {
            A_set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<B; i++) {
            B_set.add(Integer.parseInt(st.nextToken()));
        }
        
        
        for(int i : A_set) {
            if(!B_set.contains(i)) {
                count++;
            }
        }
        for(int i : B_set) {
            if(!A_set.contains(i)) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}