package test.mypac;
/*
 *  T �� type �Ķ���� �̴�
 *  
 *  ���⿡ ���޵� Ŭ������ ���� Ŭ����(Generic Ŭ����) ��� �Ѵ�.
 */
public class FruitBox<T> {
	//�ʵ�
	private T item;
	//�ʵ忡 ���� �ִ� �޼ҵ�
	public void setItem(T item) {
		this.item=item;
	}
	
	//�ʵ忡 ����� ���� �����ϴ� �޼ҵ�
	public T getItem() {
		return item;
	}
}
