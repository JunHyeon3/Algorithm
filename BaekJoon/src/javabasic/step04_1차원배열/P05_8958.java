package javabasic.step04_1차원배열;
import java.io.*;

// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
//출력 : 각 테스트 케이스마다 점수를 출력한다
public class P05_8958 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int N = Integer.parseInt(bReader.readLine());
    String[] arr = new String[N];
   
    for(int i=0; i<N; i++) {
      arr[i] = bReader.readLine();
      
      int count = 0;
      int sum = 0;

      for(int j=0; j<arr[i].length(); j++) {
        if(arr[i].charAt(j) == 'O') {
          count++;
        }
        
        else {
          count = 0;
        }
        
        sum += count;
      }

      bWriter.write(sum + "\n");
    }

    bReader.close();
    bWriter.flush();
    bWriter.close();
  }
  
}
