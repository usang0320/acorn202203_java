package test.main;

import java.util.HashMap;

public class MainClass07 {
	public static void main(String[] args) {
		HashMap<String, Object> map1=new HashMap<>();
		/*
		 * 
	     *  HashMap<key ���� type, value ���� type>
	     *  
	     *  key �� generic class �� String ���� �����ϴ°��� �Ϲ����̴�.
	     *  value �� generic class �� ���� ������ type �� �����ϸ�ȴ�.
	     *  �������� type �� ��� �����Ÿ� Object �� �����ϸ� �ȴ�.  
	     */
		/*
		 *  ������ ������ HashMap ��ü�� ������ ���� ���� 3������ ��� ������.
		 *  ��ȣ : 1
		 *  �̸� : �豸��
		 *  �������� ���� : true
		 */
		
		map1.put("��ȣ", 1);
		map1.put("�̸�", "�豸��");
		map1.put("����?", true);
		System.out.println(map1);
		/*
		 * value �� Generic Ŭ������ Object �� ���� �Ǿ� �ֱ� ������
		 * ���ϵǴ� Object type �� ���� type ���� casting �ؾ� �Ѵ�.
		 */
		
		//map1 �� ��� ��ȣ�� num, �̸��� name, �������� ���δ� isMan �̶�� ���������� ��ƺ�����
		int num =(int) map1.get("��ȣ");
		String name = (String) map1.get("�̸�");
		boolean isMan = (boolean) map1.get("����?");
	}
}
