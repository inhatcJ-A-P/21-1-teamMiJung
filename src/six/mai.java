package six;

import java.util.Scanner;

import java.util.Vector;

public class mai {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Shape> v = new Vector<>();
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int num = scan.nextInt();
			
			if (num == 1) {
				System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
				int num2 = scan.nextInt();
				if (num2 == 1) {
					v.add(new Line());
				} else if (num2 == 2) {
					v.add(new Rect());
				} else if (num2 == 3) {
					v.add(new Circle());
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
				
			} else if (num == 2) {
				System.out.print("삭제할 도형의 위치>>");
				int num3 = scan.nextInt();
				if (num3 > v.size()) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				v.remove(num3 - 1);

			} else if (num == 3) {
				for (int i = 0; i < v.size(); i++) {
					v.get(i).draw();
				}
			}
			if (num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
