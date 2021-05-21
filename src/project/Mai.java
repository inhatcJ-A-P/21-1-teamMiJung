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
			System.out.print("(1)정보 입력,(2)정보 출력,(3)종료>>");
			int num = scan.nextInt();
			if (num == 1) {
				v.add(new People());
				n++;
			}
			if (num == 2) {
				System.out.print("어떤 정보를 출력하시겠습니까?>>");
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
								System.out.println("잘못 입력하셨습니다.");
						}
					}					
				}
				System.out.println(inf);
				num=scan.nextInt();
			}
			if(num==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
