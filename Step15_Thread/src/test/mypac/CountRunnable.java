package test.mypac;
/*
 *  ���ο� ������ ����� ���2
 *  
 *  1. Runnable �������̽��� ������ Ŭ������ �����Ѵ�.
 *  2. run() �޼ҵ带 ���� �������̵� �Ѵ�.
 *  3. Thread Ŭ������ ��ü�� �����ϸ鼭 
 *     �ش�Ŭ������ ���� ��ü(CountRunnable ��ü)�� �������� ���ڷ� �����Ѵ�.
 *  4. Thread Ŭ������ ���� ��ü�� start() �޼ҵ带 ȣ���ؼ� �����带 ���۽�Ų��.
 */
public class CountRunnable implements Runnable{

	@Override
	public void run() {
		//run() ���ΰ� ���ο� �۾������� �ȴ�.
		int count=0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			System.out.println("���� ī��Ʈ:"+count);
			if(count==10) {
				break;
			}
		}
	}
	
}
