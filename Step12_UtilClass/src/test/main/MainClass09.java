package test.main;

import java.util.HashSet;
import java.util.Set;
/*
 *  HashSet �� Set �������̽��� ������ Ŭ�����̴�.
 *  
 *  - ������ ����.
 *  - key ���� ����.
 *  - �ߺ��� ������� �ʴ´�.
 *  - � data �� ����(����) ���� �����ϰ��� �� �� ����Ѵ�.
 */
public class MainClass09 {
	public static void main(String[] args) {
		//�������� ������ �� �ִ� HashSet ��ü
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		
		//���ڿ��� ������ �� �ִ� HashSet ��ü
		Set<String> set2 = new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");
		set2.add("park");
		
	}
}
