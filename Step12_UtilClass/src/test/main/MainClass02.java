package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * ArrayList ��ü��
		 * 
		 * ģ�� �̸� 5�� ���
		 * 
		 * �ݺ��� ���鼭 ģ���̸��� ������ ���� �������� ����غ�����.
		 * 
		 * 0��° ģ�� : �豸��
		 * 1��° ģ�� : �ذ�
		 * 2��° ģ�� : ������
		 */
		ArrayList<String> names = new ArrayList<>();
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		names.add("ģ��1");
		names.add("ģ��2");
		
		for(int i=0; i<names.size();i++) {
			System.out.println(i+"��° ģ�� : "+names.get(i));
		}
	}
	
	
}
