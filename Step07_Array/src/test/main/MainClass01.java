package test.main;
/*
 * java ���� �迭�� ��ü�̴�
 * �� �迭�� ���������� type �̴�
 */
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5 ��
		int[] nums={10, 20, 30 ,40 ,50};
		double[] nums2= {10.1, 10.2, 10.3, 10.4, 10.5};
		boolean[] truth= {true, false, false, true, true};
		String[] names= {"�豸��","�ذ�","������","�ֵ���","���"};
		
		//�迭�� ������ �� �����ϱ�
		int result1= nums[0]; //10
		double result2= nums2[1]; //10.2
		boolean result3= truth[2]; //false
		String result4= names[3]; //"�ֵ���"
		
		//�迭 ��ü�� �޼ҵ�� �ʵ� ����� ����
		int[] cloned=nums.clone();
		int size= nums.length;
	}
}
