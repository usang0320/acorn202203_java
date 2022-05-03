package frame09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener, KeyListener{
	
	JTextField inputMsg;
	JLabel lab1;
	
	//������
	public MyFrame(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		inputMsg= new JTextField(10);
		JButton sendBtn = new JButton("����");
		lab1 = new JLabel("JLabel �Դϴ�.");
		
		add(inputMsg);
		add(sendBtn);
		add(lab1);
		
		//��ư�� ������ ����ϱ� 
		sendBtn.addActionListener(this);
		
		//Ű������ ����ϱ�
		inputMsg.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		JFrame f = new MyFrame("���� ������");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		send();
	}
	
	//�޼ҵ� �߰�
	public void send() {
		//1. JTextField �� �Է��� ���ڿ� �о����
		String msg =inputMsg.getText();
		//2. �о�� ���ڿ��� JLabel �� ����ϱ�
		lab1.setText(msg);
		//3. �Է�â ����
		inputMsg.setText("");
		//4. ��Ŀ�� �ֱ�
		inputMsg.grabFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		 
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			send();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	
}
