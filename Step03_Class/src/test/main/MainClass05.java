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
		Rect r1 = new Rect();
		r1.width=10.3;
		r1.height=7.8;
		r1.showArea();
		double area=r1.getArea();
		System.out.println(area);

	}

}
