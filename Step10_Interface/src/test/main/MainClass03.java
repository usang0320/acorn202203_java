package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	
	//inner class
	static class YourRemocon implements Remocon{

		@Override
		public void up() {
			System.out.println("���𰡸� �÷���");	
		}

		@Override
		public void down() {
			System.out.println("���𰡸� ������");	
		}
	}
	
	public static void main(String[] args) {
		Remocon r1 = new YourRemocon();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
