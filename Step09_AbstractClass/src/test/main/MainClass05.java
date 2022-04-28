package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	static Weapon w1=new Weapon() {
		@Override
		public void attack() {
			System.out.println("���� �𸣰����� ��������!");	
		}	//�޼ҵ�� Ŭ���� �ȿ� �����ȴ�. 
		    //new Weapon() �ڿ� anonymous class �ְ� �� Ŭ������ WeaponŬ������ ��ӹ޴´�. 
	};
	
	public static void main(String[] args) {
		useWeapon(w1);
		
		Weapon w2 =new Weapon() {
			@Override
			public void attack() {
				System.out.println("����? �̰͵� �����ϳ�?");
			}
		};
		useWeapon(w2);
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("����? �̰͵� �����ϳ�?");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
