package test.mypac;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame{
	
	public TestFrame(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���̾ƿ� �Ŵ����� ���� ��� ���� �ʵ��� ����
		this.setLayout(null);

		//��ư ��ü�� �����ؼ�
		JButton btn = new JButton("��������");
		//ǥ�õ� ��ġ�� ũ�⸦ ���� ��
		btn.setBounds(10, 10, 100, 40);
		
		//�����ӿ� �߰��ϱ� this. ��������
		add(btn);
		
		setVisible(true);
		
	}

}
