package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 실수 1개 입력받아 부분별로 출력하기
// 입력 : 실수 1개가 입력된다.(1.414213)
// 출력 : 첫 번째 줄에 정수 부분을, 두 번째 줄에 실수 부분을 출력한다. (1 \n 414213)
public class Ex23 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  String a = sc.next();
	  String[] b = a.split("\\.");
	  
	  System.out.printf("%s \n%s", b[0], b[1]);
	  
	  sc.close();
	}

}
