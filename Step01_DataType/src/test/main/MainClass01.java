package test.main;
/*
 *  [ Java �⺻ ������ type ]
 *  
 *  1. ������
 *  
 *  ������ : byte, short, int, long
 *  
 *  - byte ������;  // -128 ~ 127
 *  - short ������;  // -32768 ~ 32767
 *  - int  ������; // -2,147,483,648 ~ 2,147,483,647
 *  - long ������; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  �Ǽ��� : float, double
 *  
 *  - float ������; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double ������; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�.");
		// ������ ���� �����ϰ� �� �����ϱ�
		byte iByte=10;
		short iShort=10;
		int iInt=10;
		long iLong=10;
		/*
		 * int type ������ byte type ������ ��� ������ �����Ѵٸ�?
		 * - ǥ�� ������ ������ ���� ������ ��� ����, ǥ�� ���� ������ �� ���� ������
		 *   ���� �ϴ°��� ������ ����.
		 * - ���� ������ �߻� ��Ű�� �ʴ´�.
		 */
		int tmp=iShort;
		
		/*
		 *  ǥ�� ������ ������ �� ���� ������ ��� ������ ���� �Ϸ���
		 *  ��������� casting �� �ؾ� �Ѵ�.
		 */
		byte tmp2=(byte)iInt;
		//(type) -> casting operator ����ȯ ������
		
		//�Ǽ��� ���� �����ϰ� �� �����ϱ�
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3; //d, f �� ������ ������ double type ���� ���ֵȴ�.
		
		//float type �� �ִ� ���� double type �� ���
		double tmp3=num1;
		
		//casting �����ڰ� �ʿ��ϴ�
		float tmp4=(float) num2;
		
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
		
	}
}












