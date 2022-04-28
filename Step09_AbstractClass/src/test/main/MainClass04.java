package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	//���� Ŭ����(inner class)
	static class YourWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("���߰����� �ؿ�!");
		}
	}
	
	//static main() �޼ҵ�
	public static void main(String[] args) {
		Weapon w1 = new YourWeapon();
		useWeapon(w1);
		
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("���� ���⸦ ����Ѵ�");
			}
		}
		
		Weapon w2 = new OurWeapon();
		useWeapon(w2);
	}
	/*
	 * static �޼ҵ� ��������
	 * ���� Ŭ�����ȿ� �ִ� �ڿ��� static�� �� �� �ִ�.
	 * 
	 * ex) static main �ȿ����� MainClass04 �ȿ� �ִ� �ڿ�����
	 * 		static �� ���� �ڿ��鸸 ����� �� �ִ�.
	 */
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
