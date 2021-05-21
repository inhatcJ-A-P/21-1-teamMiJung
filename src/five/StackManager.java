package five;

import java.util.Scanner;

public class StackManager {

	public static void main(String[] args) {
		StringStack stack = new StringStack();
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 수>>");
		int n = scan.nextInt();
		stack.getNum(n);
		System.out.print(">>");
		for (int i = 0; i < n; i++) {
			String s = scan.next();
			stack.push(s);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		System.out.println(stack.length());
	}

}
