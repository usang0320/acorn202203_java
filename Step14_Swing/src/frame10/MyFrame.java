package frame10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	
	JTextField tf_num1;
	JTextField tf_num2;
	JLabel label_result;
	JButton plusBtn;
	JButton minusBtn;
	JButton multiBtn;
	JButton divideBtn;
	
	//������
	public MyFrame(String title) {
		super(title);
		// BorderLayout ���� ���
		setLayout(new BorderLayout());
		
	    //JPanel
	    JPanel topPanel=new JPanel();
	    topPanel.setBackground(Color.YELLOW);
	    //Panel �� ���ʿ� ��ġ�ϱ� 
	    add(topPanel, BorderLayout.NORTH);
	      
	    //JTextField ��ü�� ���鿡�� JPanel �� �߰��ϱ� 
	    tf_num1=new JTextField(10);
	    topPanel.add(tf_num1);
	    //��� ��ư ��ü�� ���� JPanel �� �߰��ϱ�
	    plusBtn=new JButton("+");
	    minusBtn=new JButton("-");
	    multiBtn=new JButton("*");
	    divideBtn=new JButton("/");
	    topPanel.add(plusBtn);
	    topPanel.add(minusBtn);
	    topPanel.add(multiBtn);
	    topPanel.add(divideBtn);
	    //�ι�° JTextField  ���� ��ο� �߰� �ϱ� 
	    tf_num2=new JTextField(10);
	    topPanel.add(tf_num2);
	    //JLabel
	    JLabel label1=new JLabel("=");
	    label_result=new JLabel("0");
	    //��ο� ���̺� �߰��ϱ�
	    topPanel.add(label1);
	    topPanel.add(label_result);
	    
	    plusBtn.addActionListener(this);
	    minusBtn.addActionListener(this);
	    multiBtn.addActionListener(this);
	    divideBtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		JFrame f = new MyFrame("���� ������");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//������ �� String command=e.getActionCommand(); ����ؼ� �غ���
		
		try {
			double fv = Double.parseDouble(tf_num1.getText());
			double sv = Double.parseDouble(tf_num2.getText());
			//NumberFormatException �迩�⼭ �߻��� 
			Object o = e.getSource();
		
			if(o==plusBtn) {
				label_result.setText(fv+sv+"");
			}else if(o==minusBtn) {
				label_result.setText(fv-sv+"");
			}else if(o==multiBtn) {
				label_result.setText(fv*sv+"");
			}else if(o==divideBtn) {
				label_result.setText(fv/sv+"");
			}
		}catch(NumberFormatException nfe) {
			String msg = nfe.getMessage();
			System.out.println(msg);
			JOptionPane.showMessageDialog(this, "���� �������� �Է��ϼ���");
		}
		
		
			
			
		
	}	
	
}
