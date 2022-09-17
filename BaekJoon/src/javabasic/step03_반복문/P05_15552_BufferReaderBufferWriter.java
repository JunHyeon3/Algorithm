package javabasic.step03_반복문;
import java.util.*;
import java.io.*;

// 빠른 A+B
//입력 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//출력 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
public class P05_15552_BufferReaderBufferWriter {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int T = Integer.parseInt(br.readLine());
    
    StringTokenizer AB;
    
    for(int i=0; i<T; i++) {
      AB = new StringTokenizer(br.readLine()," ");
      int A = Integer.parseInt(AB.nextToken());
      int B = Integer.parseInt(AB.nextToken());
      
      bw.write(A + B + "\n");
    }
    
    br.close();
    bw.flush();
    bw.close();
  
  }
  
}
