package Minuk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class UserList extends JFrame implements ActionListener {
	
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	
	public UserList() {
		
		setTitle("회원목록");
		setSize(500,550);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(3);
	
		//기본
		Container b = getContentPane();
		b.setLayout(new BorderLayout());
		
		//center구현 
		Container fl = new Container();
		fl.setLayout(new FlowLayout());
		
		jb1 = new JButton("새로고침");
		jb1.addActionListener(this);
		
		jb2 = new JButton("등록");
		jb2.addActionListener(this);
		
		jb3 = new JButton("조회");
		jb3.addActionListener(this);
		
		jb4 = new JButton("수정");
		jb4.addActionListener(this);
		
		jb5 = new JButton("삭제");
		jb5.addActionListener(this);
		
		jb6 = new JButton("돌아가기");
		jb6.addActionListener(this);
		
		fl.add(jb1);
		fl.add(jb2);
		fl.add(jb3);
		fl.add(jb4);
		fl.add(jb5);
		fl.add(jb6);
		
		//south 구현
		JPanel f2 = new JPanel();
		f2.setLayout(new BorderLayout());
		TitledBorder tb = new TitledBorder(new LineBorder(Color.BLACK),"회원목록");
		
		String header[] = {"이름","주민번호","전화번호","주소"};
		String data[][] = {
			{"이슬비","001010","010-9879-4560","전북 김제시"},
			{"김다은","770105","010-0689-3139","제주시 서귀포시"},
			{"김홍식","780107","010-7175-1459","서울시 강남구"},
			{"홍길동","791010","010-2536-7879","충북 청주시"},
			{"한효선","810513","010-4238-4561","충남 서천군"}
		};
		
		JTable jt = new JTable(data,header);
		JScrollPane jp = new JScrollPane(jt);
		
		f2.add(jp);
		f2.setBorder(tb);
		
		//전체 프레임 구현
		b.add(fl);
		b.add(f2,BorderLayout.SOUTH);
		setVisible(true);
		
 }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==jb1) {			//새로고침
			
		}else if(obj==jb2) {	//등록
			new UserList_Regist();
		}else if(obj==jb3) {	//조회
			new UserList_Serch();
		}else if(obj==jb4) {	//수정
			new UserList_InfoRevise("회원정보 수정",300,200);
		}else if(obj==jb5) {	//삭제
			new UserList_Delete();
		}else if(obj==jb6) {	//돌아가기
			dispose();
			new MainPage();
		}
	}
	
}