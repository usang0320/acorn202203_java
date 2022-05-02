package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
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
		
		
		//�ߺ��� �����Ͱ� ������� �ʴ� ������ ������ �� �ִ� Stack ��ü ����
		Set<Integer> st = new HashSet<>();
		
		//���ѷ��� ���鼭
		while(true) {
			///������ ���ڸ� ����
			int ranNum = ran.nextInt(45)+1;
			//Stack ��ü�� ������Ű��
			st.add(ranNum);
			//��ȣ�� 6���� �Ǹ�
			if(st.size()==6) {
				break;	//�ݺ��� Ż��
			}
		}
		System.out.println(st);
		//Set �� �ִ� �����͸� ArrayList �� ���
		List<Integer> numbers = new ArrayList<>(st);
		System.out.println(numbers);
		//�����ϰ�
		Collections.sort(numbers);
		//���
		for(int tmp:numbers) {
			System.out.println(tmp+",");
		}
		
	}
}
