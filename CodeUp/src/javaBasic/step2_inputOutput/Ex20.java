package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 주민번호 입력받아 형태 바꿔 출력하기
// 입력 : 주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다. (110011-0000000)
// 출력 : '-'를 제외한 주민번호 13자리를 모두 붙여 출력한다. (1100110000000)
public class Ex20 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  String a = sc.next();
	  String[] b = a.split("\\-");
	  
	  System.out.printf("%s%s", b[0], b[1]);
	  
	  sc.close();
	}

}
