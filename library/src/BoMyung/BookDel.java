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

public class BookDel extends JFrame implements ActionListener{
	private JButton btnDel;
	private JButton btnCancel;

	public BookDel() {
		setTitle("도서삭제");
		setSize(350, 250);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		JLabel lblDel = new JLabel("도서삭제");
		lblDel.setForeground(Color.WHITE);
		p1.add(lblDel);

		JPanel p2 = new JPanel();
		JLabel lblNum = new JLabel("도서번호");
		p2.add(lblNum, BorderLayout.NORTH);

		JTextField tfNum = new JTextField(12);
		p2.add(tfNum, BorderLayout.NORTH);

		JPanel p3 = new JPanel();
		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);

		p3.add(btnDel);
		p3.add(btnCancel);

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);

		setVisible(true);
	}		
	
	public static void main(String[] args) {
		new BookDel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btnDel) {
			JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(obj == btnCancel) {
			dispose();
		}
	}

}