package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame implements ActionListener{
	//�ʵ�
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;
	List<MemberDto> list;
	MemberDto dto;
	MemberDao dao = new MemberDao();
	
	//������
	public TestFrame() {
		setLayout(new BorderLayout());
	      
        JLabel label1=new JLabel("�̸�");
        inputName=new JTextField(10);
      
        JLabel label2=new JLabel("�ּ�");
        inputAddr=new JTextField(10);
      
        JButton saveBtn=new JButton("����");
        saveBtn.setActionCommand("save");
      
        JButton deleteBtn=new JButton("����");
        deleteBtn.setActionCommand("delete");
      
        JPanel panel=new JPanel();
        panel.add(label1);
        panel.add(inputName);
        panel.add(label2);
        panel.add(inputAddr);
        panel.add(saveBtn);
        panel.add(deleteBtn);
      
        add(panel, BorderLayout.NORTH);
        
        //ǥ �������� ������ ����ϱ� ���� JTable
        table=new JTable();
        //Į������ String[] �� ������� �غ�
        String[] colNames= {"��ȣ", "�̸�", "�ּ�"};
        //���̺� ����� ������ ������ �ִ� �� ��ü (Į����, row ����)
        model=new DefaultTableModel(colNames, 0);
        //���� ���̺� �����Ѵ�.
        table.setModel(model);
        //��ũ���� ���� �ϵ��� ���̺��� JScrollPane �� ���Ѵ�.
        JScrollPane scroll=new JScrollPane(table);
        //JScrollPane  �� �������� ����� ��ġ�ϱ� 
        add(scroll, BorderLayout.CENTER);
        
        saveBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        
        list = dao.getList();
        displayMember();
    }
	
	//���̺� ������ ����ϴ� �޼ҵ�
	public void displayMember() {
		
		model.setRowCount(0); //���̺� ��µ� ������ reset

		for(MemberDto tmp : list) {
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		}
	}
	
	//main  �޼ҵ�
	public static void main(String[] args) {
	    TestFrame f=new TestFrame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setBounds(100, 100, 800, 500);
	    f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if(command.equals("save")) {
			dto = new MemberDto();
			dto.setName(inputName.getText());
			dto.setAddr(inputAddr.getText());
			
			dao.insert(dto);
			
			list = dao.getList();
			displayMember();
			
			inputName.setText("");
			inputAddr.setText("");
			
		}else if(command.equals("delete")) {
			int row = table.getSelectedRow();
			int num = (int) model.getValueAt(row, 0);
			model.removeRow(row);
			System.out.println(row);
			System.out.println(num);
			
			boolean isDelete =dao.delete(num);
			if(isDelete==true) {
				System.out.println("�����Ǿ����ϴ�.");
			}else {
				System.out.println("�������� ���߽��ϴ�.");
			}
			
		}
	}

	


}
