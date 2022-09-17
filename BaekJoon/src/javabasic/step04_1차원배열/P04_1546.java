package javabasic.step04_1차원배열;
import java.util.*;

// 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다. 이 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 
//      이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
//출력 : 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
public class P04_1546 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    double[] score = new double[N];
    double sum = 0;
    
    for(int i=0; i<N; i++) {
      score[i] = sc.nextDouble();
    }
    sc.close();
    
    Arrays.sort(score);
    
    for(int i=0; i<N; i++) {
      sum += ((score[i] / score[N-1]) * 100); 
    }
    
    System.out.println(sum/N);
  }
  
}
