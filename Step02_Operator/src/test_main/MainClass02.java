package test_main;
/*
 *  2. ���� ������ �׽�Ʈ
 *  	������ �ִ� ���� ���� 1�� ���� Ȥ�� 1�� ���� ��ų �� ����Ѵ�.
 *  ++, --
 */
public class MainClass02 {

	public static void main(String[] args) {
		int num=0;
		num++;
		num++;
		num++;	//num �� ���������� 3�� �ȴ�.
		
		int num2=0;
		num2--;
		num2--;
		num2--;	// num �� ���������� -3�� �ȴ�.
		
		int num3=0;
		int result1 = num3++;	// result1�� 0 �� ���Եǰ� num3�� 1 �����Ѵ�.
		
		int num4=0;
		int result2 = ++num4;	// num4 �� 1 �����ϰ� result2 �� 1 �� ���Եȴ�.
	}

}
