package three;
//�߻�޼ҵ� ����
import java.util.Scanner;

public abstract class Calculator {
	protected int n1,n2;
	abstract protected int calc();
	protected void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("�Ի�� ���� " + res);
	}
}
