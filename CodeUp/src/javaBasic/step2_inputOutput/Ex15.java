package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 실수 입력받아 둘째 자리까지 출력하기
public class Ex15 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  float a = sc.nextFloat();
	  System.out.printf("%.2f", a);
	  sc.close();
	}

}
