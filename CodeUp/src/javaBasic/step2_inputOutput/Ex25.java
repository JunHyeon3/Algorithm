package javaBasic.step2_inputOutput;
import java.util.Scanner;

//정수 1개 입력받아 나누어 출력하기
//입력 : 다섯 자리로 이루어진 1개의 정수를 입력받는다.
//출력 : 각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
public class Ex25 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String a = sc.next();
    String[] b = a.split("");
    for (int i=0; i<a.length(); i++) {
      System.out.printf("[%s] \n", Integer.parseInt(b[i])*(int)Math.pow(10, a.length()-i-1));
    }
    
    sc.close();
	}

}
