package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass13 {
	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		names.add("�ֵ���");
		names.add("���");
		
		//�ݺ���(Iterator) ��ü ���� (����� item �� �Ϸķ� �����ٰ� �����ϸ��)
		Iterator<String> it = names.iterator();
		
		//cursor ������ item �� �ִ� ���ȿ��� �ݺ����� ���鼭
		while(it.hasNext()) {
			//cursor �� ����ĭ���� �̵��ؼ� Ŀ���� ��ġ�� ���� item �� �о����
			String item = it.next();
			System.out.println(item);
		}
		//Ư�� item (������, ������) ���� ���� �˾Ƴ���
		boolean isContain=names.contains("�豸��");
		//����� item �� ����
		int size = names.size();
		names.remove("�ذ�");
		//��� ������ ����
		names.clear();
	}
}
