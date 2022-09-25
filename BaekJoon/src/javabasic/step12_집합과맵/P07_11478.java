package javabasic.step12_집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


// 문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000 이하이다.
// 출력 : 첫째 줄에 S의 서로 다른 부분 문자열의 개수를 출력한다.
public class P07_11478 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<S.length(); i++) {
            String result = "";
            
            for(int j=i; j<S.length(); j++) {
                result += S.substring(j, j+1);
                set.add(result);
            }
        }
        
        System.out.print(set.size());
    }
    
}