package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;

public class MainClass01 {
	public static void main(String[] args) {
		// Generic Ŭ������ Apple �� �����ؼ� Fruit ��ü �����ϱ�
		FruitBox<Apple> box1=new FruitBox<>();
		// �޼ҵ��� ���ڷ� Apple type �����ϱ�
		box1.setItem(new Apple());
		// �޼ҵ尡 �������ִ� Apple type �޾ƿ���
		Apple item1=box1.getItem();
		
		// Generic Ŭ������ Banana�� �����ؼ� FruitBox ��ü�� �����ؼ� ���� ����� �۾��� �غ�����.
		FruitBox<Banana> box2= new FruitBox<Banana>();
		box2.setItem(new Banana());
		Banana item2=box2.getItem();
	}
}
