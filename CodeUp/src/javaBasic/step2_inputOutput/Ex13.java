package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 정수 2개 입력받아 그대로 출력하기
public class Ex13 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  System.out.println(a);
	  System.out.println(b);
	  sc.close();
	}

}
