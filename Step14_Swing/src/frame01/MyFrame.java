package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//������
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�������� ���̾ƿ� �Ŵ����� ������� �ʱ� ������ UI �� ���� ��ǥ�� ���� ��ġ�ؾ��Ѵ�.
		setLayout(null);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		//��ư�� ��ġ
		btn1.setLocation(10, 10);
		//��ư�� ũ��
		btn1.setSize(100, 30);
		btn2.setBounds(120, 10, 100, 30);
		btn3.setBounds(230, 10, 100, 30);
		add(btn1);	//�����ӿ� btn1 �߰��ϱ�
		add(btn2);
		add(btn3);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("���� ������");
	}
}
