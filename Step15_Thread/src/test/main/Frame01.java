package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Frame01 extends JFrame implements ActionListener{
   
   //������
   public Frame01() {
      //���̾ƿ� ���� 
      setLayout(new BorderLayout());
      //����� �������� ��ܿ� ��ġ 
      JPanel panel=new JPanel();
      panel.setBackground(Color.YELLOW);
      add(panel, BorderLayout.NORTH);
      //��ư�� ��ο� �߰� �ϰ� 
      JButton alertBtn=new JButton("�˸� ����");
      panel.add(alertBtn);
      //��ư�� ������ ����ϱ�
      alertBtn.addActionListener(this);
   }
   
   public static void main(String[] args) {
      //MyFrame Ŭ������ �̿��ؼ� ��ü �����ϰ� �������� �������� frame �� ��� 
      Frame01 frame=new Frame01();
      //�������� ���� ����
      frame.setTitle("Frame01");
      //�������� ������ �ڵ����� ���μ����� ���� �ǵ��� �Ѵ�.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent arg0) {
      JOptionPane.showMessageDialog(this, "�˸�~~~");
      
      System.out.println("�˸�â�� �ݾ� �����ϴ�.");
      
      try {
          System.out.println("10 �ʵ��� ���� �غ� �۾��� �ؿ�");
          Thread.sleep(10000);
      } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
   }
}


