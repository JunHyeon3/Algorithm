package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 년월일 입력 받아 형식 바꿔 출력하기
//입력 : 년월일이 '.'(닷)으로 구분되어 입력된다.
//출력 : 일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력한다
public class Ex27 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String a = sc.next();
    String[] b = a.split("\\.");
    
    System.out.print(b[2] + "-" + b[1] + "-" + b[0]);
    
    sc.close();
	}

}
