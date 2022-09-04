package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 문자 1개 입력받아 그대로 출력하기
public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.next();
		System.out.println(a);
		sc.close();
	}
}
