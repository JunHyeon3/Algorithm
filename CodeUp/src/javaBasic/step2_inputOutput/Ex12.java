package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 실수 1개 입력받아 그대로 출력하기
public class Ex12 {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  float a;
	  a = sc.nextFloat();
	  System.out.printf("%f", a);
//    println(a)로 작성하면, 1.45로 출력된다.
//	  printf("%f", a)는 1.450000으로 출력된다.
	  sc.close();
	}
}
