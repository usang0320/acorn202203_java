package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		//sample ������
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "��");
		dic.put("phone", "��ȭ��");
		dic.put("car", "�ڵ���");
		dic.put("pencil", "����");
		dic.put("eraser", "���찳");
		System.out.println(dic);
		
		/*
		 * �˻��� �ܾ �Է��ϼ���:house
		 * house �� ���� ���Դϴ�.
		 * 
		 * �˻��� �ܾ �Է��ϼ���:gura
		 * gura �� ��Ͽ� �����ϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� �ܾ �Է��ϼ���:");
		String word = sc.nextLine();
		if(dic.containsKey(word)) {
			String value= dic.get(word);
			System.out.println(word+"�� ���� "+value+"�Դϴ�.");
		}
		else {
			System.out.println(word+"�� ��Ͽ� �����ϴ�");
		}
		
		//��Ǯ��
//		String value = dic.get(word);
//		 if(value == null) { //ã�� �ܾ ���� ���
//	         System.out.println(word+" �� ��Ͽ� �����ϴ�.");
//	     }else {//ã�� �ܾ �ִ� ��� 
//	         System.out.println(word+" �� ���� "+value+"�Դϴ�");
//	     }
		
		
		
		
		
	}
}
