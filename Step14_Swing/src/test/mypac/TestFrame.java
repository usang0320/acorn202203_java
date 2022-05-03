package test.mypac;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame{
	
	public TestFrame(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저를 통해 사용 하지 않도록 설정
		this.setLayout(null);

		//버튼 객체를 생성해서
		JButton btn = new JButton("눌러보셈");
		//표시될 위치와 크기를 지정 후
		btn.setBounds(10, 10, 100, 40);
		
		//프레임에 추가하기 this. 생략가능
		add(btn);
		
		setVisible(true);
		
	}

}
