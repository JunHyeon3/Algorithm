package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 문자 2개 입력받아 순서 바꿔 출력하기
public class Ex14 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String a = sc.next();
	  String b = sc.next();
	  System.out.printf("%s %s", b, a);
	  sc.close();
	  }

}
