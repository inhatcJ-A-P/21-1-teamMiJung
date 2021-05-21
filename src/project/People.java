package project;

import java.util.Scanner;

public class People{
	Scanner scan = new Scanner(System.in);
	String[] Num;
//	String HanNum;
//	String UniName;
//	String HomNum;
//	String MyName;
//	String UniNum;
//	String Address;
//	String Building;
	public People() {
			Num = new String[14];
		System.out.print("학과명>>");
		String UniName=scan.next();
		Num[0]="학과명";
		Num[1]=UniName;
		System.out.print("학번>>");
		String UniNum = scan.next();
		Num[2]="학번";
		Num[3]=UniNum;
		System.out.print("핸드폰>>");
		String HanNum = scan.next();
		Num[4]="핸드폰";
		Num[5]=HanNum;
		System.out.print("집전화>>");
		String HomNum = scan.next();
		Num[6]="집전화";
		Num[7]=HomNum;
		System.out.print("이름>>");
		String MyName = scan.next();
		Num[8]="이름";
		Num[9] =MyName;
		System.out.println("주소>>");
		String Address = scan.next();
		Num[10]="주소";
		Num[11]=Address;
		System.out.println("집 유형>>");
		String Building = scan.next();
		Num[12]="집 유형";
		Num[13]=Building;
	}
}

