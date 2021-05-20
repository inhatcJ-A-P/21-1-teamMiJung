package Minuk;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainPage extends JFrame implements ActionListener {
	JButton jb1, jb2, jb3, jb4, jb5;
	public MainPage() {
		
		setTitle("도서관리 프로그램");
		setSize(1030,730);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(3);
	
		//기본
		Container b = getContentPane();
		b.setLayout(new BorderLayout());
		
		//center 구현 (버튼들)
		Container fl = new Container();
		fl.setLayout(new FlowLayout());
		
		jb1 = new JButton("회원 등록/삭제");
		jb1.addActionListener(this);
		
		jb2 = new JButton("도서 등록/삭제");
		jb2.addActionListener(this);
		
		jb3 = new JButton("도서 대여/반납");
		jb3.addActionListener(this);
		
		jb4 = new JButton("모든 대여 정보");
		jb4.addActionListener(this);
		
		jb5 = new JButton("종료");
		jb5.addActionListener(this);
		
		fl.add(jb1);
		fl.add(jb2);
		fl.add(jb3);
		fl.add(jb4);
		fl.add(jb5);
		
		//south 구현 (이미지)
		ImageIcon image = new ImageIcon("Welcome.jpg");
		JLabel jl = new JLabel(image);
	
		//실행
		b.add(fl,BorderLayout.NORTH);
		b.add(jl,BorderLayout.SOUTH);
		
		setVisible(true);
		
 }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==jb1) {			// 회원 등록,삭제 버튼
			dispose();
			new UserList();
		}else if(obj==jb2) {// 도서 등록,삭제 버튼
			dispose();
			new BoMyung.BookManagement();
		}else if(obj==jb3) {	// 도서 대여,반납 버튼
			dispose();
			new HyungJoon.RentOrReturn("도서대여/반납",600,700);
		}else if(obj==jb4) {	// 모든 대여정보 버튼
			dispose();
			new MinYeong.LentalBook("대여정보", 350, 450);
		}else if(obj==jb5) {	// 종료 버튼
			dispose();
		}
	}
	
}