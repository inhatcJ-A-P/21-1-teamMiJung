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
		setTitle("�����˻�");
		setSize(350, 250);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ�
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		JLabel lblSearch = new JLabel("�����˻�");
		lblSearch.setForeground(Color.WHITE);
		p1.add(lblSearch);

		JPanel p2 = new JPanel();
		JLabel lblTitle = new JLabel("�������� : ");
		p2.add(lblTitle, BorderLayout.NORTH);

		JTextField tfTitle = new JTextField(12);
		p2.add(tfTitle, BorderLayout.NORTH);

		JPanel p3 = new JPanel();
		btnSearch = new JButton("�˻�");
		btnSearch.addActionListener(this);
		btnCancel = new JButton("���");
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
			JOptionPane.showMessageDialog(null, "�˻��� �Ϸ�Ǿ����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE); //��ư Ȯ������ �ٲٱ�
		} else if (obj == btnCancel) {
			dispose();
		}

	}
}