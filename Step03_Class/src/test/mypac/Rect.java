package test.mypac;

public class Rect {
	public double width;
	public double height;
	
	public void showArea() {
		System.out.println("����:"+width*height);
	}
	
	//������ �޼ҵ带 ȣ���Ѱ����� �������ִ� �޼ҵ�
	public double getArea() {
		double area=width*height;
		return area;
	}
}
