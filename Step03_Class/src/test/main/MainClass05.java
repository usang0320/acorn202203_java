package test.main;
/*
 *  Rect ��� �̸��� Ŭ������ ������� �Ѵ�.
 *  
 *  �ش� Ŭ������ ��ü�� �����ϰ�
 *  
 *  �簢���� ����(width), ����(height) �� �ʵ忡 �����ϰ�
 *  
 *  showArea() �� ȣ���ϸ� �簢���� ���̰� �ܼ�â�� ��µ� �� �ֵ���
 *  
 *  Rect Ŭ������ �����غ�����.
 */
import test.mypac.Rect;
public class MainClass05 {

	public static void main(String[] args) {
		Rect r1 = new Rect(10.3,7.8);
		r1.width=9.76;
		r1.height=6.48;
		r1.showArea();
		double area=r1.getArea();
		System.out.println(area);

	}

}
