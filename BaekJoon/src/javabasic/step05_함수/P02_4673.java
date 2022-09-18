package javabasic.step05_함수;

// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
// 입력 : 입력은 없다.
// 출력 : 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
public class P02_4673 {
  
  public static int d(int n) {
    int sum = n; 
    
    while(n != 0) {
      sum += n%10; 
      n /= 10; 
    }
    
    return sum;
  }

  public static void main(String[] args) {
    boolean[] arr = new boolean[10001];
    
    for(int i=1; i<=10000; i++) {
      int a = d(i);

      
      if(a <= 10000) {  
        arr[a] = true;
      }
    }

    for(int i=1; i<=10000; i++) {
      if(!arr[i]) {
        System.out.println(i);
      }
    }
  }
  
}
