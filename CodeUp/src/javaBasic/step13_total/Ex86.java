package javaBasic.step13_total;
import java.util.Scanner;

// 그림 파일 저장용량 계산하기
//입력 : w, h, b 가 공백을 두고 입력된다. 단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
//출력 : 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다
public class Ex86 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double w = sc.nextDouble();
    double h = sc.nextDouble();
    double b = sc.nextDouble();
    double memory = w*h*b;
    
    System.out.printf("%.2f MB", memory/8/1024/1024);
    
    sc.close();    
  }
  
}
