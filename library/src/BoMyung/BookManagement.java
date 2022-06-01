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
	private JButton btnRefresh, btnRegistration, btnSearch, btnChange, btnDel, btnBack; //���ΰ�ħ, ���, ��ȸ, ����, ����, ���ư��� ��ư ����
	private JLabel lbl;

	public BookManagement() {
		setTitle("��������");
		setSize(500, 550);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���̾ƿ�
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		add(p1, BorderLayout.NORTH);

		btnRefresh = new JButton("���ΰ�ħ");
		btnRefresh.addActionListener(this);

		btnRegistration = new JButton("���");
		btnRegistration.addActionListener(this);

		btnSearch = new JButton("��ȸ");
		btnSearch.addActionListener(this);

		btnChange = new JButton("����");
		btnChange.addActionListener(this);

		btnDel = new JButton("����");
		btnDel.addActionListener(this);
		
		btnBack = new JButton("���ư���");
		btnBack.addActionListener(this);
		
		p1.add(btnRefresh);
		p1.add(btnRegistration);
		p1.add(btnSearch);
		p1.add(btnChange);
		p1.add(btnDel);
		p1.add(btnBack);
		
		
		p2 = new JPanel(new BorderLayout());
		p2.setBorder(new TitledBorder(new LineBorder(Color.GRAY),"�������")); //p2�� �׵θ��� Ÿ��Ʋ ����
//		p2.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		add(p2, BorderLayout.CENTER);
		
		String header[] = {"������ȣ","����","����","���ǻ�","����","���⿩��"};
		String contents[][]= {{"A001","���󿡼����������ģ������","����ȫ","���̵�book","2600","Y"},
				{"A002","�б��� ��ſ�","�츮���� �۵�","�����","23700","Y"}
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
			new Main("���� ���� ���α׷�", 950, 700);
//			System.exit(0);
		}
	}

}
