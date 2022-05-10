package test.mypac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * 1. JTextField �� ���ڿ��� �Է��ϰ� �߰� ��ư�� ������
 *    �Է��� ���ڿ��� myFolder/memo.txt ���Ͽ� append �ǵ��� �� ������.
 * 
 * 2. �ҷ����� ��ư�� ������ myFolder/memo.txt ���Ͽ� �ִ� ��� ���ڿ���
 * 	  JTextArea �� ����ϵ��� �� ������.
 */
public class QuizMain2 extends JFrame implements ActionListener{
	//�ʵ�
	JTextField tf_msg;
    JTextArea area;
   
    //������
    public QuizMain2() {
    	setTitle("���� ������");
        setLayout(new BorderLayout());
      
        JPanel topPanel=new JPanel();
        //JTextField ��ü�� �������� �ʵ忡 ���� 
        tf_msg=new JTextField(10);
      
        JButton appendBtn=new JButton("�߰��ϱ�");
        JButton loadBtn=new JButton("�ҷ�����");
        appendBtn.setActionCommand("append");
        loadBtn.setActionCommand("load");
      
      
        topPanel.add(tf_msg);
        topPanel.add(appendBtn);
        topPanel.add(loadBtn);
      
        add(topPanel, BorderLayout.NORTH);
        topPanel.setBackground(Color.YELLOW);
      
        //JTextArea
        area=new JTextArea();
        //�������� ����� JTextArea  ��ġ�ϱ�
        add(area, BorderLayout.CENTER);
        
        appendBtn.addActionListener(this);
        loadBtn.addActionListener(this);
   
    }
   
    public static void main(String[] args) {
    	QuizMain2 f=new QuizMain2();
        f.setBounds(100, 100, 500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
      
    }

    @Override
	public void actionPerformed(ActionEvent e) {
    	String command = e.getActionCommand();
    	File memoFile = new File("c:/acorn202203/myFolder/memo.txt");
    	if(command.equals("append")) {
    		FileWriter fw = null;
            try {
            	fw = new FileWriter(memoFile,true);
    		    //�����ӿ��� �߰��� �ؽ�Ʈ �� ��������
            	String str = tf_msg.getText();
            	fw.write(str);
            	fw.write("\n");
            	fw.flush();
            	tf_msg.setText("");
            	
    	    } catch (IOException ioe) {
    		    ioe.printStackTrace();
    	    }finally {
    	    	try {
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
    	    }
    	}else if(command.equals("load")) {
    		FileReader fr = null;
    		BufferedReader br = null;
    		try {
				fr = new FileReader(memoFile);
				br = new BufferedReader(fr);
				String str = "";
				while(true) {
					String str1 = br.readLine();
					if(str1==null) {
						break;
					}
					str+=str1+"\n";
					System.out.println(str);
				}
				area.setText(str);
					
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally {
				try {
					if(br!=null)br.close();
					if(fr!=null)fr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
    	}
    }
}
