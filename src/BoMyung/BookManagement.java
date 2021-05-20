package BoMyung;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class BookManagement extends JFrame implements ActionListener {
	private JPanel p1 ,p2;
	private JButton btnRefresh, btnRegistration, btnSearch, btnChange, btnDel, btnBack; //새로고침, 등록, 조회, 수정, 삭제, 돌아가기 버튼 생성
	private JLabel lbl;

	public BookManagement() {
		setTitle("도서관리");
		setSize(500, 550);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		add(p1, BorderLayout.NORTH);

		btnRefresh = new JButton("새로고침");
		btnRefresh.addActionListener(this);

		btnRegistration = new JButton("등록");
		btnRegistration.addActionListener(this);

		btnSearch = new JButton("조회");
		btnSearch.addActionListener(this);

		btnChange = new JButton("수정");
		btnChange.addActionListener(this);

		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		
		btnBack = new JButton("돌아가기");
		btnBack.addActionListener(this);
		
		p1.add(btnRefresh);
		p1.add(btnRegistration);
		p1.add(btnSearch);
		p1.add(btnChange);
		p1.add(btnDel);
		p1.add(btnBack);
		
		
		p2 = new JPanel(new BorderLayout());
		p2.setBorder(new TitledBorder(new LineBorder(Color.GRAY),"도서목록")); //p2에 테두리와 타이틀 생성
//		p2.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		add(p2, BorderLayout.CENTER);
		
		String header[] = {"도서번호","제목","저자","출판사","가격","대출여부"};
		String contents[][]= {{"A001","세상에서가장멋진내친구똥퍼","이은홍","아이들book","2600","Y"},
				{"A002","학교는 즐거워","헤리엣지 퍼드","사계절","23700","Y"}
		};		
		JTable table = new JTable(contents, header);
		JScrollPane sc = new JScrollPane(table);		
		p2.add(sc);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new BookManagement();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == btnRefresh) { 
			p2.revalidate();
		} else if (obj == btnRegistration) {
//			dispose();
			new BookRegistration();
		}else if(obj==btnSearch){
//			dispose();
			new BookSearch();
		}
		else if(obj == btnChange) {
//			dispose();
			new BookChange();
		}
		else if (obj == btnDel) {
//			dispose();
			new BookDel();
		}
		else if(obj == btnBack) {
			dispose();
			new Main("도서 관리 프로그램", 950, 700);
//			System.exit(0);
		}
	}

}
