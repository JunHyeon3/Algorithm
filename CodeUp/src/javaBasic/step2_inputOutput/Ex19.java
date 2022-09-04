package javaBasic.step2_inputOutput;
import java.util.Scanner;

//연월일 입력받아 그대로 출력하기
//입력 : 연, 월, 일이 ".(닷)"으로 구분되어 입력된다. (2013.8.5)
//출력 : 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다. (2013.08.05)
//      (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
public class Ex19 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

//	  배열 b를 선언하여, a의 값을 .단위로 나누어 저장함
	  String a = sc.next();
	  String[] b = a.split("\\.");
	
//	  배열 b에 들어있는 문자를 정수형으로 변환
	  int b1 = Integer.parseInt(b[0]);
	  int b2 = Integer.parseInt(b[1]);
	  int b3 = Integer.parseInt(b[2]);
	  
//	  %04d는 4글자로 만들고 빈곳은 0으로 채움
	  System.out.printf("%04d.", b1);
	  System.out.printf("%02d.", b2);
	  System.out.printf("%02d", b3);
	  
	  sc.close();
	}

}
