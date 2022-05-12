package test.main;

import java.util.ArrayList;

/*
 *  java ���� �迭�� ũ�⸦ ������ �� ���� ���� �迭�̴�.
 *  
 *  ���� �������� item �� �߰��ϰ� �����ϰ� �ϴ� �۾��� �Ϸ��� �Ϲݹ迭�� ����� �� ����.
 *  
 *  �׷��� �ش� �۾��� �Ϸ��� ArrayList ��ü�� ����ϸ� �ȴ�.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//String type �� ������ �� �ִ� ArrayList ��ü����
		ArrayList<String> names=new ArrayList<>();
		// "�豸��", "�ذ�", "������" 3���� String type �� ������ ������.
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		
		Object names2 = names.clone();
		System.out.println(names2);
		
		//0������ �������� �ҷ��ͼ� item �̶�� ������ ��ƺ�����
		String item= names.get(0);
		
		names.remove(1);

		names.set(0, "acorn");
		
		//����� �������� ����(size) �� size ��� ���������� ��ƺ�����.
		int size=names.size();
		
		//����� ��� ������ ����
		names.clear();
		
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
	}
}
