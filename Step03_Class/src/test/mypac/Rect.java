package test.mypac;

public class Rect {
	public double width;
	public double height;
	
	public Rect(double w, double h) {
		this.width=w;
		this.height=h;
	}
	
	public void showArea() {
		System.out.println("넓이:"+width*height);
	}
	
	//면적을, 메소드를 호출한곳으로 리턴해주는 메소드
	public double getArea() {
		double area=width*height;
		return area;
	}
}
