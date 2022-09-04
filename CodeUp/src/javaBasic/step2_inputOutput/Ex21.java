package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 단어 1개 입력받아 그대로 출력하기
// 입력 : 한 단어가 입력된다.(단, 단어의 길이는 50자 이하이다.)
// 출력 : 입력된 단어 그대로 출력
public class Ex21 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  String a = sc.next();
	  
	  System.out.printf("%s", a);
	  
	  sc.close();
	}

}
