package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		//Remocon �������̽��� ����(implements) �� Ŭ������ �̿��ؼ� Remocon type �� ������ ����
		Remocon r1= new MyRemocon();
		r1.up();
		r1.down();
		
		//�������̽��� �ʵ� ����(static final)
		String result=Remocon.COMPANY;
		System.out.println(result);
	}
}
