package test.main;
/*
 *  [ Java �⺻ ������ type ]
 *  
 *  2. ���� (boolean)
 *  
 *  - true, false �ΰ��� ���� �ϳ��̴�.
 *  - true, false �� ���� ���ų� �񱳿��� Ȥ�� �� ������ ����� ���� �ִ�. 
 *  - ���� ������ ��Ÿ���� ������ type 
 */
public class Mainclass03 {
	//run ���� �� ������ �帧�� ���۵Ǵ� Ư���� main �޼ҵ�(�⺻ �޼ҵ�)
	public static void main(String[] args) {
		//���� ���� ����� ���ÿ� �� �����ϱ�
		boolean isRun=true;
		if(isRun) {
			System.out.println("�޷���");
		}
		
		//�񱳿����� ����� ����� boolean �� ���
		boolean isGreater=10>1;
		//�������� ����� ����� boolean �� ���
		boolean result=true&&false;
		if(result) {
			System.out.println("result �� true�� ��");
		}
		else {
			System.out.println("result �� false �� ��");
		}
		
//		System.out.println(result);
		//�ѹ� ������ ������ �ٽ� ���� �� �� ����.
		//boolean result=false;
		
		result=false; 
		// ������ �ٸ� ���� ���� �� �� �ִ�(������ type �� ���)
		
		//�ٸ� type ���� ������ ���� �� ����.
		//result=10;

	}

}
