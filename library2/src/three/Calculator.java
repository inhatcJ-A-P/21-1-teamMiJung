package three;
//추상메소드 구현
import java.util.Scanner;

public abstract class Calculator {
	protected int n1,n2;
	abstract protected int calc();
	protected void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("게산된 값은 " + res);
	}
}
