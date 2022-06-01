package BoMyung;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookSearch extends JFrame implements ActionListener {
	private JButton btnSearch;
	private JButton btnCancel;

	public BookSearch() {
		setTitle("도서검색");
		setSize(350, 250);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		JLabel lblSearch = new JLabel("도서검색");
		lblSearch.setForeground(Color.WHITE);
		p1.add(lblSearch);

		JPanel p2 = new JPanel();
		JLabel lblTitle = new JLabel("도서제목 : ");
		p2.add(lblTitle, BorderLayout.NORTH);

		JTextField tfTitle = new JTextField(12);
		p2.add(tfTitle, BorderLayout.NORTH);

		JPanel p3 = new JPanel();
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(this);
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);

		p3.add(btnSearch, BorderLayout.SOUTH);
		p3.add(btnCancel, BorderLayout.SOUTH);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new BookSearch();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btnSearch) { 
			JOptionPane.showMessageDialog(null, "검색이 완료되었습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE); //버튼 확인으로 바꾸기
		} else if (obj == btnCancel) {
			dispose();
		}

	}
}