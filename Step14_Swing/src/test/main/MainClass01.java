package test.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass01 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Hello Frame");
		//�ʱ� ��ġ�� ũ�� ����
		f.setBounds(100, 100, 500, 500);
		//�������� �ݾ��� �� �ڵ����� ���μ��� ���� �ǵ���
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���̾ƿ� �Ŵ����� ���� ��� ���� �ʵ��� ����
		f.setLayout(null);

		//��ư ��ü�� �����ؼ�
		JButton btn = new JButton("��������");
		//ǥ�õ� ��ġ�� ũ�⸦ ���� ��
		btn.setBounds(10, 10, 100, 40);
		
		//�����ӿ� �߰��ϱ�
		f.add(btn);
		
		//�������� ���̵��� �Ѵ�.
		f.setVisible(true);
	}
}
