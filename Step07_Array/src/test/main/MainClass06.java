package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  Scanner ��ü�� �̿��ؼ� ���ڿ��� 5�� �Է� �޴´�.
		 *  �Է¹��� ���ڿ��� ���ʴ�� �迭�� ���� �Ǿ�� �Ѵ�.
		 *  ��� �� �Է� ���� �� for ���� �̿��ؼ� �迭�� �����
		 *  ��� ���ڿ��� �ܼ�â�� ������� ����ϴ� �ڵ带 �ۼ��� ������.
		 */
		Scanner sc = new Scanner(System.in);
		String[] strings=new String[5];
		
		for(int i=0; i<strings.length; i++) {
			System.out.println("���ڿ� �Է�:");
			String str = sc.nextLine();
			strings[i]=str;
		}
		for(int i=0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
		
	}
}
