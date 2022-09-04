package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 시간 입력받아 그대로 출력하기
// 입력 : 시(hour)와 분(minute)이 ":" 으로 구분되어 입력된다. (3:10)
// 출력 : 입력받은 시간을 "시:분" 형식으로 출력한다. (3:10)
public class Ex18 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String a = sc.next();
	  System.out.printf(a);
	  sc.close();
	}

}
