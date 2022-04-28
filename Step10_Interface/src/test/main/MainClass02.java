package test.main;

import test.mypac.Remocon;
import test.mypac.TestRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		//���� Ŭ������ test.mypac ��Ű���� ���� useRemocon() �޼ҵ带 ���⼭ ȣ���� ������.
		Remocon r1 = new TestRemocon();
		useRemocon(r1);
		
		useRemocon(new Remocon() {

			@Override
			public void up() {
				System.out.println("�������̵��� �������");
			}

			@Override
			public void down() {
				System.out.println("test��");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
