package test.mypac;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		File f1=new File("c:/acorn202203/myFolder/folder1");
		//���������
		f1.mkdir();
		
		for(int i=0; i<1000; i++) {
			File tmp = new File("c:/acorn202203/myFolder/folder"+i);
			//tmp.mkdir();	//���� �����
			tmp.delete();	//���� �����ϱ�
		}
	}
}
