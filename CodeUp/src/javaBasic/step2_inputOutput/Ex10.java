package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 정수 1개 입력받아 그대로 출력하기
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}

}
