package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountRunnable;
import test.mypac.CountThread;


public class Frame05 extends JFrame implements ActionListener{
   
   //������
   public Frame05() {
      //���̾ƿ� ���� 
      setLayout(new BorderLayout());
      //����� �������� ��ܿ� ��ġ 
      JPanel panel=new JPanel();
      panel.setBackground(Color.YELLOW);
      add(panel, BorderLayout.NORTH);
      //��ư�� ��ο� �߰� �ϰ� 
      JButton countBtn=new JButton("1~10 ���� ����");
      panel.add(countBtn);
      //��ư�� ������ ����ϱ�
      countBtn.addActionListener(this);
   }
   
   public static void main(String[] args) {
      //MyFrame Ŭ������ �̿��ؼ� ��ü �����ϰ� �������� �������� frame �� ��� 
      Frame05 frame=new Frame05();
      //�������� ���� ����
      frame.setTitle("Frame02");
      //�������� ������ �ڵ����� ���μ����� ���� �ǵ��� �Ѵ�.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent arg0) {
      new Thread(new Runnable() {
         @Override
         public void run() {
            //run �޼ҵ� ������ ���ο� �۾� ������ �ȴ�.
            int count=0;
            while(true) {
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
               count++;
               System.out.println("���� ī��Ʈ:"+count);
               if(count==10) {
                  break;
               }
            }
         }
      }).start();
      
      System.out.println("���ο� �����带 ���� �߽��ϴ�.");
   }
}


















