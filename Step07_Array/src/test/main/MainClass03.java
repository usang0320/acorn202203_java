package test.main;

public class MainClass03 {

	public static void main(String[] args) {
		//String type �� ���� �� �ִ� �� 3��¥�� �� �迭��ü�� ���� �������� �������� names �����
		String[] names=new String[3];
		
		//������ �濡 ������� ���ڿ� �����ϱ�
		names[0]="�豸��";
		names[1]="�ذ�";
		names[2]="������";
		
//		for(String tmp: names) {
//			System.out.println(tmp);
//		}
		
		for(int i=0; i<names.length; i++) {
			//i ��° String type ��ü�� �����ؼ�(�ҷ��ͼ�)
			String tmp = names[i];
			//����ϱ�
			System.out.println(tmp);
		}
	}

}
