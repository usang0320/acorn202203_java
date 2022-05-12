package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener, PropertyChangeListener{
	//�ʵ�
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;
	
	//������
	public MemberFrame() {
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
        model=new DefaultTableModel(colNames, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
               System.out.println(row+" | "+column);
               
               if(column==0) { // 0��° Į���� 
                  return false; //���� �Ұ��ϰ� false �� ������ �ش�.
               }else { //�ٸ� ���� 
                  return true; //��� ���� �����ϰ� true �� ������ �ش�. 
               }
            }
        };
        //���� ���̺� �����Ѵ�.
        table.setModel(model);
        //��ũ���� ���� �ϵ��� ���̺��� JScrollPane �� ���Ѵ�.
        JScrollPane scroll=new JScrollPane(table);
        //JScrollPane  �� �������� ����� ��ġ�ϱ� 
        add(scroll, BorderLayout.CENTER);
        
      //��ư�� �׼Ǹ����� ���
        saveBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        
        displayMember();
        
        //���̺��� ���� �ٲ������ Ȯ���� ������
        table.addPropertyChangeListener(this);
        
    }
	
	//���̺� ������ ����ϴ� �޼ҵ�
	public void displayMember() {
		
		model.setRowCount(0); //���̺� ��µ� ������ reset
		
		//���� DB�� ����� ������
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.getList();

		for(MemberDto tmp : list) {
			//MemberDto ��ü�� �ִ� ȸ�� ������ �̿��ؼ� Object �迭�� �����.
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			//row �� �߰��Ѵ�.
			model.addRow(row);
		}
	}
	
	//main  �޼ҵ�
	public static void main(String[] args) {
	    MemberFrame f=new MemberFrame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setBounds(100, 100, 800, 500);
	    f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if(command.equals("save")) {
			MemberDto dto = new MemberDto();
			dto.setName(inputName.getText());
			dto.setAddr(inputAddr.getText());
			
			MemberDao dao = new MemberDao();
			dao.insert(dto);
			
			displayMember();
			
			inputName.setText("");
			inputAddr.setText("");
			
		}else if(command.equals("delete")) {
			int[] rows = table.getSelectedRows();
			if(rows.length==0) {
				JOptionPane.showMessageDialog(this, "���õ� row �� �����ϴ�.");
				return;
			}else {
				for(int tmp : rows) {
					int num = (int) model.getValueAt(tmp, 0);
					MemberDao dao = new MemberDao();
					dao.delete(num);
				}	
				
				displayMember();
			}	
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property change!");
		System.out.println("property name:"+evt.getPropertyName());
		System.out.println("isEditing:"+table.isEditing());
		/*
		 *  property name �� "tableCellEditor" �̰�
		 *  table �� �������� �ƴ� ��
		 *  ���� ��Ŀ���� �ִ� ���� ������ ��� �о�ͼ� DB �� ���� �ݿ��ϱ�
		 */
		if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
			//���� ��Ŀ���� �ִ� row �� ������ DB �� ���� �ݿ��Ѵ�.
			//��ȭ�� ���� �о�ͼ� DB �� �ݿ��Ѵ�. 
            //������ Į���� �ִ� row  ��ü�� ���� �о�´�. 
            int selectedIndex=table.getSelectedRow();
            int num=(int)model.getValueAt(selectedIndex, 0);
            String name=(String)model.getValueAt(selectedIndex, 1);
            String addr=(String)model.getValueAt(selectedIndex, 2);
            //������ ȸ���� ������ MemberDto ��ü�� ��� 
            MemberDto dto=new MemberDto(num, name, addr);
            //DB�� �����ϱ� 
            new MemberDao().update(dto);
            //���õ� ��Ŀ�� Clear
            table.clearSelection();
		}
	}

	


}
