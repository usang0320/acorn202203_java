package test.main;

import test.mypac.Bike;

public class MainClass04 {

	public static void main(String[] args) {
		/*
		 * 1. Bike ��ü�� ���� �� �ִ� �� 3��¥�� �迭��ü�� �����ؼ� ��������
		 *    bikes ��� ���������� ��ƺ�����.
		 * 2. �迭�� ������ ��(0,1,2��) �� Bike ��ü�� �����ؼ� ��� ������.
		 * 3. �ݺ��� for �� �̿��ؼ� ������� �迭�� ������ �濡 �ִ� Bike ��ü��
		 *    ride() �޼ҵ带 ȣ���غ�����. 
		 */
		
		Bike[] bikes=new Bike[3];
		bikes[0]=new Bike();
		bikes[1]=new Bike();
		bikes[2]=new Bike();
		
		for(int i=0; i<bikes.length; i++) {
			bikes[i].ride();
		}
	}

}
