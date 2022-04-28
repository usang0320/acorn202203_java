package test.mypac;
/*
 *  [ interface ]
 *  
 *  - �����ڰ� ���� (�ܵ� ��ü ���� �Ұ�)
 *  - ������ �޼ҵ�� ���� �� ���� (�߻� �޼ҵ常 ���� �� �ִ�)
 *  - �ʵ�� static final ����� ���� �� �ִ�.
 *  - data type �� ������ �� �� �ִ�.
 *  - interface type �� �������� �ʿ��ϸ� ����(implements) Ŭ������ ����
 *    ��ü�� �����ؾ� �Ѵ�.
 *  - Ŭ���� ����� ���ϻ�������� interface�� �������� implements �� �� �ִ�.
 */
public interface Remocon {
	//�ʵ�� static final �ʵ常 ���� �� �ִ�.
	public static final String COMPANY="LG";	//static final�� ���� �Ǿ static final ������ �Ѵ�
	public static final double PI=3.14159;
	
	//�޼ҵ�� �߻� �޼ҵ常 ���� �� �� �ִ�.
	public void up();
	public void down();
	
}
