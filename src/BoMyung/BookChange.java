package BoMyung;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookChange extends JFrame implements ActionListener {
	private JTextField tfNum;
	private JButton btnSearch;
	private JTextField tfSearch;
	private JTextField tfTitle;
	private JTextField tfWriter;
	private JTextField tfPublisher;
	private JTextField tfPrice;
	private JTextField tfRent;
	private JButton btnChange;
	private JButton btnBack;

	public BookChange() {
		setTitle("도서정보 수정");
		setSize(300, 280);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃
		setLayout(new FlowLayout());

		JPanel p1 = new JPanel();
		JLabel lblNum = new JLabel("도서번호: ");
		p1.add(lblNum);

		tfSearch = new JTextField(13);
		p1.add(tfSearch);

		btnSearch = new JButton("검색");
		p1.add(btnSearch);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(6, 2));

		JLabel lblBookNum = new JLabel("도서번호");
		p2.add(lblBookNum);

		tfNum = new JTextField(15);
		p2.add(tfNum);

		JLabel lblTitle = new JLabel("제목");
		p2.add(lblTitle);

		tfTitle = new JTextField(15);
		p2.add(tfTitle);

		JLabel lblWriter = new JLabel("저자");
		p2.add(lblWriter);
		tfWriter = new JTextField();
		p2.add(tfWriter);

		JLabel lblPublisher = new JLabel("출판사");
		p2.add(lblPublisher);
		tfPublisher = new JTextField(15);
		p2.add(tfPublisher);

		JLabel lblPrice = new JLabel("가격");
		p2.add(lblPrice);
		tfPrice = new JTextField(15);
		p2.add(tfPrice);

		JLabel lblRent = new JLabel("대여여부");
		p2.add(lblRent);
		tfRent = new JTextField(15);
		p2.add(tfRent);

		JPanel p3 = new JPanel();

		btnChange = new JButton("수정");
		btnChange.addActionListener(this);
		p3.add(btnChange);

		btnBack = new JButton("돌아가기");
		btnBack.addActionListener(this);
		p3.add(btnBack);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);

		setVisible(true);

	}

	public static void main(String[] args) {
		new BookChange();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btnChange) {
			JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
		} else if (obj == btnBack) {
			dispose();
		}
	}
}