package project;

import java.util.Scanner;
import java.util.Vector;

public class Mai {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<People> v = new Vector<>();
		int n=0;
		String inf=null;
		while (true) {
			System.out.print("(1)���� �Է�,(2)���� ���,(3)����>>");
			int num = scan.nextInt();
			if (num == 1) {
				v.add(new People());
				n++;
			}
			if (num == 2) {
				System.out.print("� ������ ����Ͻðڽ��ϱ�?>>");
				String HowInfor = scan.next();
				boolean flag = false;
				for (int i = 0; i < n; i++) {
					for (int j = 1; j < 14; j+=2) {
						flag=HowInfor.contains(v.get(i).Num[j]);						
						if(flag==true) {
							for (int k = 0; k < 14; k+=2) {
								inf = v.get(i).Num[k+1];		
							}
							if(flag==false)
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}					
				}
				System.out.println(inf);
				num=scan.nextInt();
			}
			if(num==3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}

}
