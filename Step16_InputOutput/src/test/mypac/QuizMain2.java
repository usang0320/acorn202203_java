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
 * 1. JTextField 에 문자열을 입력하고 추가 버튼을 누르면
 *    입력한 문자열이 myFolder/memo.txt 파일에 append 되도록 해 보세요.
 * 
 * 2. 불러오기 버튼을 누르면 myFolder/memo.txt 파일에 있는 모든 문자열을
 * 	  JTextArea 에 출력하도록 해 보세요.
 */
public class QuizMain2 extends JFrame implements ActionListener{
	//필드
	JTextField tf_msg;
    JTextArea area;
   
    //생성자
    public QuizMain2() {
    	setTitle("나의 프레임");
        setLayout(new BorderLayout());
      
        JPanel topPanel=new JPanel();
        //JTextField 객체의 참조값을 필드에 저장 
        tf_msg=new JTextField(10);
      
        JButton appendBtn=new JButton("추가하기");
        JButton loadBtn=new JButton("불러오기");
        appendBtn.setActionCommand("append");
        loadBtn.setActionCommand("load");
      
      
        topPanel.add(tf_msg);
        topPanel.add(appendBtn);
        topPanel.add(loadBtn);
      
        add(topPanel, BorderLayout.NORTH);
        topPanel.setBackground(Color.YELLOW);
      
        //JTextArea
        area=new JTextArea();
        //프레임의 가운데에 JTextArea  배치하기
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
    		    //프레임에서 추가한 텍스트 값 가져오기
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
