package BoMyung;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main extends JFrame implements ActionListener {
	ImageIcon icon;
	private JPanel p1;
	private JLabel welcomeLabel;
	private JButton b1, btnBookManagement, b3, b4, b5;

	public Main(String title, int width, int height) {
		icon = new ImageIcon("Images/Welcome.jpg");
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		add(p1, BorderLayout.NORTH);

		b1 = new JButton("회원 등록/삭제");
		b1.setBackground(Color.WHITE);
		b1.addActionListener(this);

		btnBookManagement = new JButton("도서 등록/삭제");
		btnBookManagement.setBackground(Color.WHITE);
		btnBookManagement.addActionListener(this);

		b3 = new JButton("도서대여/반납");
		b3.setBackground(Color.WHITE);
		b3.addActionListener(this);

		b4 = new JButton("모든대여정보");
		b4.setBackground(Color.WHITE);
		b4.addActionListener(this);

		b5 = new JButton("종료");
		b5.setBackground(Color.WHITE);
		b5.addActionListener(this);

		p1.add(b1);
		p1.add(btnBookManagement);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		ImageIcon icon = new ImageIcon("Images/Welcome.jpg");
		welcomeLabel = new JLabel(icon);
		add(welcomeLabel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Main("도서 관리 프로그램", 950, 700);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == b1) { 
//			dispose();
			this.setVisible(false);
		} else if (obj == btnBookManagement) {
			dispose();
			new BookManagement();
		} else if (obj == b5) {
			System.exit(0);
		}
	}
}