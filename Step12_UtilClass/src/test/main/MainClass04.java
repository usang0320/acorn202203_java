package test.main;

import java.util.ArrayList;

public class MainClass04 {
	public static void main(String[] args) {
		//������ ���� �� �� �ִ� ArrayList ��ü�� �����ؼ� �������� ArrayList type �� �������� nums �� ���
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//Ȯ�� for ���� �̿��ؼ� ����� ������ ������� �ܼ�â�� ����ϱ�
		for(Integer tmp:nums) {	//type�� int �� ��
			System.out.println(tmp);
		}
	}
}
