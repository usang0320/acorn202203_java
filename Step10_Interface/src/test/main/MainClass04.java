package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1 = new Remocon() {
			
			@Override
			public void up() {
				System.out.println("�÷���");
			}
			
			@Override
			public void down() {
				System.out.println("������");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {

			@Override
			public void up() {
				System.out.println("�÷���");	
			}

			@Override
			public void down() {
				System.out.println("������");
			}
			
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		
	}
}
