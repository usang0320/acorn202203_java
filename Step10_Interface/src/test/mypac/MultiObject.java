package test.mypac;

public class MultiObject implements Remocon, Drill{

	@Override
	public void up() {
		System.out.println("�÷���");
	}

	@Override
	public void down() {
		System.out.println("������");
	}

	@Override
	public void hole() {
		System.out.println("������ �վ��");
	}

}
