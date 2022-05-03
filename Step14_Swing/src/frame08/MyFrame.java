package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*
 * JTextField ��ü�� �޼ҵ带 �� Ȱ���ؼ�
 * 
 * �޼����� �Է��ϰ� �������� ��ư�� ������
 * 
 * �Է��� �޼����� �˸�â�� ��µǵ��� ���α׷��� �� ������
 */
public class MyFrame extends JFrame implements ActionListener{
	
	public JTextField inputMsg;
	
	//������
	public MyFrame(String title) {
		super(title);
		//���̾ƿ� ����
		setLayout(new FlowLayout());
		//������ JTextField ��ü�� �������� �ʵ忡 �����ϱ�
		inputMsg=new JTextField(10);
		
		JButton btn=new JButton("��������");
		
		add(inputMsg);
		add(btn);	
		//��ư�� ������ �� ������ ��ü ����ϱ�
		btn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		JFrame f = new MyFrame("���� ������");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//1. JTextField �� �Է��� ���ڿ��� �о�ͼ�
		String msg=this.inputMsg.getText();
		//2. �˸�â�� ����
		JOptionPane.showMessageDialog(this, msg);
	}
}
