package javabasic.step12_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
//        둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 
//        이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
// 출력 : 듣보잡의 수와 그 명단을 사전순으로 출력한다.
public class P05_1764 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            map.put(br.readLine(), null);
        }
        
        for(int i=0; i<M; i++) {
            String S = br.readLine();
            
            if(map.containsKey(S)) {
                count++;
                list.add(S);
            }        
        }
        
        Collections.sort(list);
        
        System.out.println(count);
        for(int i=0; i<count; i++) {
            System.out.println(list.get(i));
        }
    }
    
}