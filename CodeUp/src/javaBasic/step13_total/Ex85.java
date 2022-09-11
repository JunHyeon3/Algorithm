package javaBasic.step13_total;
import java.util.Scanner;

// 소리 파일 저장용량 계산하기
//입력 : h, b, c, s 가 공백을 두고 입력된다. h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수
//출력 : 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력
public class Ex85 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double h = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double s = sc.nextDouble();
    double memory = h*b*c*s;
    
    System.out.printf("%.1f MB", memory/8/1024/1024);
    
    sc.close();    
  }
  
}
