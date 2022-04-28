package test.main;

import test.mypac.Weapon;
import test.mypac.newWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w1= new newWeapon();
		useWeapon(w1);
	}
	//이 메소드는 아주 복잡한 동작을 하는 메소드라고 가정하자
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
