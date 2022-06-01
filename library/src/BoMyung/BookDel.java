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
		setTitle("��������");
		setSize(350, 250);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ�
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		JLabel lblDel = new JLabel("��������");
		lblDel.setForeground(Color.WHITE);
		p1.add(lblDel);

		JPanel p2 = new JPanel();
		JLabel lblNum = new JLabel("������ȣ");
		p2.add(lblNum, BorderLayout.NORTH);

		JTextField tfNum = new JTextField(12);
		p2.add(tfNum, BorderLayout.NORTH);

		JPanel p3 = new JPanel();
		btnDel = new JButton("����");
		btnDel.addActionListener(this);
		btnCancel = new JButton("���");
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
			JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(obj == btnCancel) {
			dispose();
		}
	}

}