package test.mypac;

public class Member {
	//�ʵ�
	public int num;
	public String name;
	public String addr;	
	
	//�޼ҵ�
	public void showInfo() {
		//�ʵ忡 ����� ������ �Ʒ��� ���� �������� �ܼ�â�� ����ϴ� �ڵ带 �ۼ��� ������.
		//��ȣ:1, �̸�:�豸��, �ּ�:�뷮��
		System.out.println("��ȣ:"+this.num+", �̸�:"+this.name+", �ּ�:"+this.addr);
	}
	
}
