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
	//필드
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;
	
	//생성자
	public MemberFrame() {
		setLayout(new BorderLayout());
	      
        JLabel label1=new JLabel("이름");
        inputName=new JTextField(10);
      
        JLabel label2=new JLabel("주소");
        inputAddr=new JTextField(10);
      
        JButton saveBtn=new JButton("저장");
        saveBtn.setActionCommand("save");
      
        JButton deleteBtn=new JButton("삭제");
        deleteBtn.setActionCommand("delete");
      
        JPanel panel=new JPanel();
        panel.add(label1);
        panel.add(inputName);
        panel.add(label2);
        panel.add(inputAddr);
        panel.add(saveBtn);
        panel.add(deleteBtn);
      
        add(panel, BorderLayout.NORTH);
        
        //표 형식으로 정보를 출력하기 위한 JTable
        table=new JTable();
        //칼럼명을 String[] 에 순서대로 준비
        String[] colNames= {"번호", "이름", "주소"};
        //테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)
        model=new DefaultTableModel(colNames, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
               System.out.println(row+" | "+column);
               
               if(column==0) { // 0번째 칼럼은 
                  return false; //수정 불가하게 false 를 리턴해 준다.
               }else { //다른 경우는 
                  return true; //모두 수정 가능하게 true 를 리턴해 준다. 
               }
            }
        };
        //모델을 테이블에 연결한다.
        table.setModel(model);
        //스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
        JScrollPane scroll=new JScrollPane(table);
        //JScrollPane  을 프레임의 가운데에 배치하기 
        add(scroll, BorderLayout.CENTER);
        
      //버튼에 액션리스너 등록
        saveBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        
        displayMember();
        
        //테이블의 값이 바뀌었는지 확인할 리스너
        table.addPropertyChangeListener(this);
        
    }
	
	//테이블에 데이터 출력하는 메소드
	public void displayMember() {
		
		model.setRowCount(0); //테이블에 출력된 데이터 reset
		
		//실제 DB에 저장된 데이터
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.getList();

		for(MemberDto tmp : list) {
			//MemberDto 객체에 있는 회원 정보를 이용해서 Object 배열을 만든다.
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			//row 를 추가한다.
			model.addRow(row);
		}
	}
	
	//main  메소드
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
				JOptionPane.showMessageDialog(this, "선택된 row 가 없습니다.");
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
		 *  property name 이 "tableCellEditor" 이고
		 *  table 이 수정중이 아닐 때
		 *  현재 포커스가 있는 곳의 정보를 모두 읽어와서 DB 에 수정 반영하기
		 */
		if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
			//현재 포커스가 있는 row 의 정보를 DB 에 수정 반영한다.
			//변화된 값을 읽어와서 DB 에 반영한다. 
            //수정된 칼럼에 있는 row  전체의 값을 읽어온다. 
            int selectedIndex=table.getSelectedRow();
            int num=(int)model.getValueAt(selectedIndex, 0);
            String name=(String)model.getValueAt(selectedIndex, 1);
            String addr=(String)model.getValueAt(selectedIndex, 2);
            //수정할 회원의 정보를 MemberDto 객체에 담고 
            MemberDto dto=new MemberDto(num, name, addr);
            //DB에 저장하기 
            new MemberDao().update(dto);
            //선택된 포커스 Clear
            table.clearSelection();
		}
	}

	


}
