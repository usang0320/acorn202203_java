package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  Scanner ��ü�� �̿��ؼ� �ݺ��� ���鼭 ģ�� �̸��� 3�� �Է� �޾Ƽ�
		 *  �Է¹��� �̸��� ArrayList ��ü�� ������� ������ �ϴ� ���α׷��� �غ�����.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			System.out.println("ģ�� �̸��� �Է��ϼ���");
			String name=sc.nextLine();
			names.add(name);
		}
		
		//����� ������ �ݺ��� ���鼭 ������� ����ϱ�
		for(int i=0; i<names.size(); i++) {
			//i��° item
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("---------");
		
		//Ȯ�� for ��
		for(String tmp:names) {	//�ݷ��� �������ٰ� �迭�̳� ArrayList�� �������� �־��ش�
			System.out.println(tmp);
		}
	}
}
