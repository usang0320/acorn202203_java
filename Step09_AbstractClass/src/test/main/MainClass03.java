package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;
/*
 *  Ŭ���� �ȿ� ���� Ŭ���� : inner class
 *  �޼ҵ� �ȿ� ���� Ŭ���� : local inner class
 */
public class MainClass03 {
	public static void main(String[] args) {
		// Zoo Ŭ������ �ִ� getMonkey() �޼ҵ带 ȣ���ؼ�		
		// ���ϵǴ� ���� m1�̶�� ���������� ��ƺ�����
		Zoo z = new Zoo();
		Monkey m1 = z.getMonkey();
		m1.say();
		
		// Zoo Ŭ������ �ִ� getTiger() �޼ҵ带 ȣ���ؼ�
		// ���ϵǴ� ���� t1 �̶�� ���������� ��� ������.
		
		Tiger t1 = z.getTiger();
		t1.say();
		
		//�޼ҵ� �ȿ��� Ŭ������ ���� �� �� �ִ�.
		class Gura{
			public void say() {
				System.out.println("�ȳ� ���� �����!");
			}
		}
		Gura g1 = new Gura();
		g1.say();
	}

}
