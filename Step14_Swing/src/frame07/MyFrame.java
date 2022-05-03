package frame07;

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
		
	//������
	public MyFrame(String title) {
		super(title);
		
		
		//MyFrame �� ���̾ƿ� �Ŵ��� �����ϱ�
		setLayout(new FlowLayout());
		
		//��ư
		JButton sendBtn =new JButton("����");
		JButton removeBtn =new JButton("����");
		//�����ӿ� ��ư �߰��ϱ� ( FlowLayout �� ������ �޴´�.)
		add(sendBtn);
		add(removeBtn);
		
		//��ư�� ������ ����ϱ�
		sendBtn.addActionListener(this);
		removeBtn.addActionListener(this);
		
		//��ư�� �׼� command �����ϱ�
		sendBtn.setActionCommand("send");
		removeBtn.setActionCommand("remove");
	}
	
	public static void main(String[] args) {
		JFrame f=new MyFrame("���� ������");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//������ ��ư�� command �� �о�ͼ�
		String command = e.getActionCommand();
		//�б��Ѵ�.
		if(command.equals("send")) {
			JOptionPane.showMessageDialog(this, "����");
		}else if(command.equals("remove")) {
			JOptionPane.showMessageDialog(this, "����");
		}
	}
}










