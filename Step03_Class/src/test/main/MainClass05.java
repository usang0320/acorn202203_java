package test.main;
/*
 *  Rect 라는 이름의 클래스를 만들고자 한다.
 *  
 *  해당 클래스로 객체를 생성하고
 *  
 *  사각형의 폭과(width), 높이(height) 를 필드에 대입하고
 *  
 *  showArea() 를 호출하면 사각형의 넓이가 콘솔창에 출력될 수 있도록
 *  
 *  Rect 클래스를 설계해보세요.
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
