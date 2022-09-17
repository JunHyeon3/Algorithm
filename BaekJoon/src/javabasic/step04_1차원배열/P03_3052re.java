package javabasic.step04_1차원배열;
import java.io.*;

// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//출력 : 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
public class P03_3052re {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int[] arr = new int[10];
    int count = 0;
    
    for(int i=0; i<10; i++) {
      arr[i] = Integer.parseInt(br.readLine())%42; 
    }

    for(int i=0; i<10; i++) {
      boolean bl = true;
      
      for(int j=i+1; j<10; j++) {
        if(arr[i] == arr[j]) {
          bl = false;
        }
      }
      
      if(bl) {
        count++;
      }
    }

    System.out.print(count);
  }
  
}
