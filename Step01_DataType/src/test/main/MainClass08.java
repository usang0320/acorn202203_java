package test.main;

public class MainClass08 {

	public static void main(String[] args) {
		String str="abcde12345";
		int len=str.length();
		
		char result=str.charAt(3);
		System.out.println(result);
		/*
		 * String ��ü�� �޼ҵ带 Ȱ���ؼ�
		 * str �����ȿ� �ִ� ���ڸ� ��� �빮��(UpperCase)�� ��ȯ�ؼ�
		 * str2 ��� �̸��� ������ ��� ������.
		 */
		String str2=str.toUpperCase();
		
		//���� ���ڿ����� mimi ��� ���ڿ��� mama��� ���ڿ��� ��ü�ؼ� ����� greet2�� ��ƺ���
		String greet="Hello! mimi, Bye! mimi";
		String greet2=greet.replace("mimi", "mama");
		
		String message="My name is Kimgura";
		/*
		 *  1. ���� ���ڿ��� My ��� ���ڿ��� �����ϴ��� ���� (true or false)�� isStart ��� ������ ��� ������.
		 *  
		 *  2. ���� ���ڿ����� i �� ���ڿ��� ���° �ε����� ��ġ�ϰ� �ִ����� index ��� ������ ��� ������.
		 */
		
		boolean isStart=message.startsWith("My");
		int index=message.indexOf("i");
		
	}

}
