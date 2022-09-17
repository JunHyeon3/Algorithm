package javabasic.step03_반복문;
//import java.util.*;
import java.io.*;

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
public class P08_2438 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int N = Integer.parseInt(br.readLine());
    String S = "";
    
    for(int i=0; i<N; i++) {
      S += "*";
      bw.write(S + "\n");
    }
    
    br.close();
    bw.flush();
    bw.close();
//    Scanner sc = new Scanner(System.in);
//    
//    int N = sc.nextInt();
//    String S = "";
//    for(int i=0; i<N; i++) {
//      S += "*";
//      System.out.println(S);
//    }
//  
//    sc.close();
  }
  
}
