package BoMyung;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookRegistration extends JFrame implements ActionListener {
	private JPanel p1;
	private JLabel lbl1;
	private JPanel p2;
	private JPanel p3;
	private JButton btnOK;
	private JButton btnCancel;

	public BookRegistration() {
		setTitle("�������");
		setSize(300, 250);
		setLocationRelativeTo(this);
//		setLocation(800, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		add(p1,new BorderLayout().NORTH);
		
		lbl1 = new JLabel("�������");
		lbl1.setForeground(Color.WHITE);
		p1.add(lbl1);
		
		p2 = new JPanel(new GridLayout(6,2));
		add(p2, BorderLayout.CENTER);
		
		JLabel lblNum = new JLabel("������ȣ");
		p2.add(lblNum);
		
		JTextField jf1 = new JTextField();
		p2.add(jf1);
		
		JLabel lblTitle = new JLabel("����");
		p2.add(lblTitle);
		
		JTextField jf2 = new JTextField();
		p2.add(jf2);
		
		JLabel lblWriter = new JLabel("����");
		p2.add(lblWriter);
		
		JTextField jf3 = new JTextField();
		p2.add(jf3);
		
		JLabel lblCompany = new JLabel("���ǻ�");
		p2.add(lblCompany);
		
		JTextField jf4 = new JTextField();
		p2.add(jf4);
		
		JLabel lblPrice = new JLabel("����");
		p2.add(lblPrice);
		
		JTextField jf5= new JTextField();
		p2.add(jf5);
		
		JLabel lblInfo = new JLabel("�뿩����");
		p2.add(lblInfo);
		
		JTextField jf6= new JTextField();
		p2.add(jf6);
		if(!(jf6.getText()=="Y" || jf6.getText()=="N")) {
			
		}
		
		p3 = new JPanel();
		add(p3, BorderLayout.SOUTH);
		
		btnOK = new JButton("Ȯ��");
		btnOK.addActionListener(this);
		btnCancel = new JButton("���");
		btnCancel.addActionListener(this);
		
		p3.add(btnOK);
		p3.add(btnCancel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BookRegistration();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == btnOK) { 
//			overlapCheck();	
			JOptionPane.showMessageDialog(null, "�Է��� �Ϸ�Ǿ����ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
		} else if (obj == btnCancel) {
			dispose();
		}
	}

	private void overlapCheck() { //�ߺ� Ȯ�� �Լ�
		
	}

}