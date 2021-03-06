package test.main;

import java.util.Scanner;
/*
 *  RuntimeException 을 상속 받은 Exception 종류는 
 *  try ~ catch 블럭으로 묶어주지 않아도 문법 오류가 발생하지 않는다.
 *  따라서 필요시 선택적으로 try ~ catch 블럭으로 묶어주면 된다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나눌 수 입력:");
		String inputNum1= sc.nextLine();
		System.out.println("나누어 지는 수 입력:");
		String inputNum2= sc.nextLine();
		try {
			int num1=Integer.parseInt(inputNum1);
			int num2=Integer.parseInt(inputNum2);
			
			int result=num2/num1;	//몫
			int result2=num2%num1;	//나머지
			System.out.println(num2+"를 "+num1+"으로 나눈 몫 : "+result);
			System.out.println(num2+"를 "+num1+"으로 나눈 나머지 : "+result2);
		}catch(NumberFormatException nfe) {
			System.out.println("정수로 입력해 주세요");
		}catch(ArithmeticException ae) {
			System.out.println("어떤 수를 0으로 나눌 수는 없어요");
		}catch(Exception e){//위의 2가지 예외를 제외한 다른 Exception 이 발생하면 실행되는 블럭
			System.out.println("예외가 빌생했습니다");
		}finally {//예외발생과 상관없이 반드시 실행이 보장되는 블럭
			System.out.println("무언가 중요한 마무리 작업을 해요!");
		}
		
		
		System.out.println("main 메소드가 정상 종료 됩니다.");
	}
}
