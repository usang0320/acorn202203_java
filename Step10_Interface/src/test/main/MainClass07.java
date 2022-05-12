package test.main;

import test.mypac.Joinner;

public class MainClass07 {
	public static void main(String[] args) {
		
		Joinner j1 = new Joinner() {
			@Override
			public String join(String one, String two) {
				return one+two;
			}
		};
		
		Joinner j2 = (one, two)->{
			return one + two;
		};
		
		Joinner j3 = (one, two)-> one+two;
		
		String result1=j1.join("kim", "gura");
		String result2=j2.join("kim", "gura");
		String result3=j3.join("kim", "gura");
		
		//���ڿ��� ������ ���Ƶ� �������� �ٸ� �� �ִ�.(���� ���� �ִ�.)
		boolean isEqual = result1 == result2;
		System.out.println(isEqual);
		//���ڿ��� �����(������ ������ ��) �� ���� String ��ü�� �޼ҵ带 Ȱ���ؾ��Ѵ�.
		boolean isEqual2 = result1.equals(result2); 
		boolean isEqual3 = result1.equals("kimgura");
		boolean isEqual4 = "kimgura".equals(result1);
	}
}
