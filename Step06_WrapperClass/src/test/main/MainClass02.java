package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//�⺻������ type double
		double num1 = 10.1;
		//���� ������ type Double
		Double num2 = 10.2;
		
		//���� ������ type Double ������ ��ġ �⺻ ������ type �� ���� ����� �� �ִ�.
		double result1 = num2+10;
		double result2 = num1+num2;
		Double result3 = num1+num2;
		
		//���ڸ� ���ڿ��� �ٲٱ� 10.2 => "10.2"
		String strNum = num2.toString();
		
		//���ڿ��� ����(double)�� �ٲٱ� "10.3" => 10.3
		double result4 = Double.parseDouble("10.3");
	}
}
