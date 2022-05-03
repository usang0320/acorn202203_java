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
	
	//생성자
	public MyFrame(String title) {
		super(title);
		// BorderLayout 으로 사용
		setLayout(new BorderLayout());
		
	    //JPanel
	    JPanel topPanel=new JPanel();
	    topPanel.setBackground(Color.YELLOW);
	    //Panel 을 북쪽에 배치하기 
	    add(topPanel, BorderLayout.NORTH);
	      
	    //JTextField 객체를 만들에서 JPanel 에 추가하기 
	    tf_num1=new JTextField(10);
	    topPanel.add(tf_num1);
	    //기능 버튼 객체를 만들어서 JPanel 에 추가하기
	    plusBtn=new JButton("+");
	    minusBtn=new JButton("-");
	    multiBtn=new JButton("*");
	    divideBtn=new JButton("/");
	    topPanel.add(plusBtn);
	    topPanel.add(minusBtn);
	    topPanel.add(multiBtn);
	    topPanel.add(divideBtn);
	    //두번째 JTextField  만들어서 페널에 추가 하기 
	    tf_num2=new JTextField(10);
	    topPanel.add(tf_num2);
	    //JLabel
	    JLabel label1=new JLabel("=");
	    label_result=new JLabel("0");
	    //페널에 레이블 추가하기
	    topPanel.add(label1);
	    topPanel.add(label_result);
	    
	    plusBtn.addActionListener(this);
	    minusBtn.addActionListener(this);
	    multiBtn.addActionListener(this);
	    divideBtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		JFrame f = new MyFrame("나의 프레임");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//복습할 때 String command=e.getActionCommand(); 사용해서 해보기
		
		try {
			double fv = Double.parseDouble(tf_num1.getText());
			double sv = Double.parseDouble(tf_num2.getText());
			//NumberFormatException ↑여기서 발생함 
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
			JOptionPane.showMessageDialog(this, "숫자 형식으로 입력하세요");
		}
		
		
			
			
		
	}	
	
}
