package test_main;
/*
 * 6. 3�� ������ �׽�Ʈ
 */
public class MainClass06 {

	public static void main(String[] args) {
		boolean isWhat=false;
		// isWhat �� true �� "��ٷ���" �� ���Եǰ� false �� "��ٸ��� �ʾƿ�"�� ���Եȴ�.
		String result = isWhat ? "��ٷ���" : "��ٸ��� �ʾƿ�";	
		
		System.out.println(result);
		
		//���� 3�� �����ڴ� �Ʒ��� ���� if ~else ���� ���� �����̴�.
		String result2=null;
		if(isWhat) {
			result2="��ٷ���";
		}
		else {
			result2="��ٸ��� �ʾƿ�";
		}
		System.out.println(result2);
	}

}
