package frame06;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
		JButton sendBtn;
		JButton removeBtn;

	//������
	public MyFrame(String title) {
		super(title);
		
		
		//MyFrame �� ���̾ƿ� �Ŵ��� �����ϱ�
		setLayout(new FlowLayout());
		
		//��ư
		sendBtn =new JButton("����");
		removeBtn =new JButton("����");
		//�����ӿ� ��ư �߰��ϱ� ( FlowLayout �� ������ �޴´�.)
		add(sendBtn);
		add(removeBtn);
		
		sendBtn.addActionListener(this);
		removeBtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		JFrame f=new MyFrame("���� ������");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//������ ��ư�� ������ ������
		Object o=e.getSource();
		
		if (o==sendBtn) {
			JOptionPane.showMessageDialog(this, "�����մϴ�");
		}
		else if(o==removeBtn) {
//		JFrame a =this;
//		MyFrame b =this;
//		Component c =this;
//		ActionListener d = this;
		//.showMessageDialog (�˸��� ��� �������� ������, ��� �޼���)
		JOptionPane.showMessageDialog(this, "�����մϴ�.");
		
		}
	}
}
