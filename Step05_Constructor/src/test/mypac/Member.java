package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	/*
	 * �⺻ �����ڵ� ���� �ʿ��ϴٸ� ���� �� �� �ִ�.
	 * �����ڴ� �������ǰ� �����ϴ�.
	 * ���� � ��ü�� �����ϴ� ����� ���������� �� ���� �ִٴ� ���̴�.
	 */
	public Member() {}
	
	//�ʵ忡 ������ ���� ���޹޴� ������
	public Member(int a, String b, String addr) {
		this.num=a;
		this.name=b;
		this.addr=addr;
	}
}
