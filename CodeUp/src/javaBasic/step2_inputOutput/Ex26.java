package javaBasic.step2_inputOutput;
import java.util.Scanner;

//시분초 입력받아 분만 출력하기
//입력 : 시:분:초 형식으로 입력된다.
//출력 : 분만 출력한다.
public class Ex26 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String a = sc.next();
    String[] b = a.split("\\:");
    int c = Integer.parseInt(b[1]);

    
    if(c == 0) {
      System.out.print(c);
    }
    else {
      System.out.printf("%s", b[1]);
    }
    
    sc.close();
	}

}
