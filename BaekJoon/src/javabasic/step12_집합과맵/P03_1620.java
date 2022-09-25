package javabasic.step12_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 현재 가지고 있는 포켓몬 도감에서 포켓몬의 이름을 보면 포켓몬의 번호를 말하거나, 포켓몬의 번호를 보면 포켓몬의 이름을 말하는 연습
// 입력 : 첫째 줄에는 도감에 수록되어 있는 포켓몬의 개수 N이랑 내가 맞춰야 하는 문제의 개수 M이 주어짐.
//        둘째 줄부터 N개의 줄에 포켓몬의 번호가 1번인 포켓몬부터 N번에 해당하는 포켓몬까지 한 줄에 하나씩 입력으로 들어옴. 
// 출력 : 첫째 줄부터 차례대로 M개의 줄에 각각의 문제에 대한 답을 말하기, 
//        입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을, 문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출
public class P03_1620 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for(int i=1; i<=N; i++) {
            String S = br.readLine();
            map1.put(i, S);
            map2.put(S, i);
        }
        
        for(int i=0; i<M; i++) {
            String S = br.readLine();
            
            if(S.charAt(0) <= 57) {
                sb.append(map1.get(Integer.parseInt(S))).append("\n");
                
            }
            else {
                sb.append(map2.get(S)).append("\n");
            }
        }
        
        System.out.print(sb);
    }
    
}