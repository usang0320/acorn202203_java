package test.main;

import test.mypac.Weapon;
import test.mypac.newWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w1= new newWeapon();
		useWeapon(w1);
	}
	//�� �޼ҵ�� ���� ������ ������ �ϴ� �޼ҵ��� ��������
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
