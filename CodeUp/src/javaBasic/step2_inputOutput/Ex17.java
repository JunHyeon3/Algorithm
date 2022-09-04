package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 정수 1개 입력받아 3번 출력하기
public class Ex17 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  System.out.printf("%d %d %d", a, a, a);
	  sc.close();
	}

}
