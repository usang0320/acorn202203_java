package test.mypac;

public class MacBook {
	//�ܺο��� ���� �Ұ��ϵ��� ���� �����ڸ� private �� �ؼ� �ʵ� 3�� �����ϱ�
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//������
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	//�޼ҵ�
	public void doGame() {
		if(this.cpu==null || memory==null || hardDisk==null) {
			System.out.println("��ǳ�� �����ؼ� �ƺ��� ���� �� �� �����ϴ�.");
			return; //�޼ҵ带 ���⼭ ������
		}
		System.out.println("�ų��� ������ �ؿ�!");
	}
}
