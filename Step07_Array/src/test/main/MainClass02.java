package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0 ���� �ʱ�ȭ�� �� 3��¥�� int[] ��ü ���� �������� ���� ���� nums�� ���
		int[] nums= {0,0,0};
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		//0 ���� �ʱ�ȭ�� �� 3�� ¥�� int[] ��ü ���� �������� �������� nums2�� ���
		int[] nums2=new int[3];
		nums2[0]=100;
		nums2[1]=200;
		nums2[2]=300;
//		nums2[3]=400; // ??? ���� ���ȣ�� �����ϸ� Exception�� �߻��Ѵ�.
		
		System.out.println("������ �۾��� �ϰ� app�� ���� �մϴ�.");
	}
}
