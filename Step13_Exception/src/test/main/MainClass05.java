package test.main;

import java.util.Random;

import test.mypac.SleepyException;

public class MainClass05 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		for(int i=0; i<100; i++) {
			//0~9 ������ ������ ������ �߻���Ų��.
			int ranNum=ran.nextInt(10);
			if(ranNum==5) {//�쿬�� ������ ������ 5�� ������ ���ܸ� �߻� ��Ų��.
				//throw ������ �Բ� ���� ��ü�� �����ϸ� ���ܰ� �߻��Ѵ�.
				throw new SleepyException("�ʹ�����..");
			}
			
			System.out.println(i+1+"��° �۾���..");
		}
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}
