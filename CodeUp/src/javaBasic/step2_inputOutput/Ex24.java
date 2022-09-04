package javaBasic.step2_inputOutput;
import java.util.Scanner;

// 단어 1개 입력받아 나누어 출력하기
// 입력 : 단어(영어) 하나를 입력받는다. (Boy)
// 출력 : 단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩 ' '로 묶어서 출력한다. ('B' 'o' 'y')
public class Ex24 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  String a = sc.next();
	  
//	charAt() 으로 한글자씩 나눔  
	  for (int i=0; i<a.length(); i++) {
	    System.out.printf("\'%s\' \n", a.charAt(i));
	  }
	  
	  sc.close();
	}

}
