package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		//Exception �� ó���� �ʿ䰡 ����
		MyUtil.draw();
		
		//send() �޼ҵ忡�� �߻��ϴ� Exception �� ó���ؾ� �Ѵ�.
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
