package test.main;

import test.mypac.Calc;

public class MainClass08 {
	public static void main(String[] args) {
		//Calc �������̽��� ���ٽ�(�����ڵ�) ���� �����ϱ�
		
		Calc add2 = new Calc() {
			@Override
			public double exec(double a, double b) {
				return a+b;
			}
		};
		
		Calc add3=(a,b)->{
			return a+b;
		};
		
		Calc add=(a,b)->a+b;
		Calc sub=(a,b)->a-b;
		Calc multi=(a,b)->a*b;
		Calc divide=(a,b)->a/b;
		
		double result1=add.exec(10, 20);
		double result2=sub.exec(10, 20);
		double result3=multi.exec(10,  20);
		double result4=divide.exec(10, 20);
	}
}
