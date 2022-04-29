package test.main;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 *  run �� ������ �ζǹ�ȣ 6 ���� �����ϰ� ����ϴ� �ڵ带 �ۼ��� ������.
 *  
 *  1~45 ������ ���� �߿� 6���� ���;� �ϸ�
 *  �ߺ��Ǵ� ���ڰ� ������ �ȵǰ�
 *  ���� ���ں��� ū���� ���� �����ؼ� ����غ�����.
 */
public class QuizMain {
	public static void main(String[] args) {
		Random ran = new Random();
		TreeSet<Integer> nums=new TreeSet<>();
		
		while(nums.size()<6) {
			int ranNum=ran.nextInt(45)+1;
			nums.add(ranNum);
		}
		System.out.println("�̹��� ��÷��ȣ�� "+nums+"�Դϴ�.");
		
	}
}
