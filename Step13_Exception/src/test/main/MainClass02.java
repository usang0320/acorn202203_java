package test.main;

import java.util.Scanner;
/*
 *  RuntimeException �� ��� ���� Exception ������ 
 *  try ~ catch ������ �������� �ʾƵ� ���� ������ �߻����� �ʴ´�.
 *  ���� �ʿ�� ���������� try ~ catch ������ �����ָ� �ȴ�.
 */
public class MainClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� �Է�:");
		String inputNum1= sc.nextLine();
		System.out.println("������ ���� �� �Է�:");
		String inputNum2= sc.nextLine();
		try {
			int num1=Integer.parseInt(inputNum1);
			int num2=Integer.parseInt(inputNum2);
			
			int result=num2/num1;	//��
			int result2=num2%num1;	//������
			System.out.println(num2+"�� "+num1+"���� ���� �� : "+result);
			System.out.println(num2+"�� "+num1+"���� ���� ������ : "+result2);
		}catch(NumberFormatException nfe) {
			System.out.println("������ �Է��� �ּ���");
		}catch(ArithmeticException ae) {
			System.out.println("� ���� 0���� ���� ���� �����");
		}catch(Exception e){//���� 2���� ���ܸ� ������ �ٸ� Exception �� �߻��ϸ� ����Ǵ� ��
			System.out.println("���ܰ� �����߽��ϴ�");
		}finally {//���ܹ߻��� ������� �ݵ�� ������ ����Ǵ� ��
			System.out.println("���� �߿��� ������ �۾��� �ؿ�!");
		}
		
		
		System.out.println("main �޼ҵ尡 ���� ���� �˴ϴ�.");
	}
}
