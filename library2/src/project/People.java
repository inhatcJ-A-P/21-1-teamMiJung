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
		System.out.print("�а���>>");
		String UniName=scan.next();
		Num[0]="�а���";
		Num[1]=UniName;
		System.out.print("�й�>>");
		String UniNum = scan.next();
		Num[2]="�й�";
		Num[3]=UniNum;
		System.out.print("�ڵ���>>");
		String HanNum = scan.next();
		Num[4]="�ڵ���";
		Num[5]=HanNum;
		System.out.print("����ȭ>>");
		String HomNum = scan.next();
		Num[6]="����ȭ";
		Num[7]=HomNum;
		System.out.print("�̸�>>");
		String MyName = scan.next();
		Num[8]="�̸�";
		Num[9] =MyName;
		System.out.println("�ּ�>>");
		String Address = scan.next();
		Num[10]="�ּ�";
		Num[11]=Address;
		System.out.println("�� ����>>");
		String Building = scan.next();
		Num[12]="�� ����";
		Num[13]=Building;
	}
}

