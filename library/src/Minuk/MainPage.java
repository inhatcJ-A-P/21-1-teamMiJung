package Minuk;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainPage extends JFrame implements ActionListener {
	JButton jb1, jb2, jb3, jb4, jb5;
	public MainPage() {
		
		setTitle("�������� ���α׷�");
		setSize(1030,730);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(3);
	
		//�⺻
		Container b = getContentPane();
		b.setLayout(new BorderLayout());
		
		//center ���� (��ư��)
		Container fl = new Container();
		fl.setLayout(new FlowLayout());
		
		jb1 = new JButton("ȸ�� ���/����");
		jb1.addActionListener(this);
		
		jb2 = new JButton("���� ���/����");
		jb2.addActionListener(this);
		
		jb3 = new JButton("���� �뿩/�ݳ�");
		jb3.addActionListener(this);
		
		jb4 = new JButton("��� �뿩 ����");
		jb4.addActionListener(this);
		
		jb5 = new JButton("����");
		jb5.addActionListener(this);
		
		fl.add(jb1);
		fl.add(jb2);
		fl.add(jb3);
		fl.add(jb4);
		fl.add(jb5);
		
		//south ���� (�̹���)
		ImageIcon image = new ImageIcon("Welcome.jpg");
		JLabel jl = new JLabel(image);
	
		//����
		b.add(fl,BorderLayout.NORTH);
		b.add(jl,BorderLayout.SOUTH);
		
		setVisible(true);
		
 }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==jb1) {			// ȸ�� ���,���� ��ư
			dispose();
			new UserList();
		}else if(obj==jb2) {// ���� ���,���� ��ư
			dispose();
			new BoMyung.BookManagement();
		}else if(obj==jb3) {	// ���� �뿩,�ݳ� ��ư
			dispose();
			new HyungJoon.RentOrReturn("�����뿩/�ݳ�",600,700);
		}else if(obj==jb4) {	// ��� �뿩���� ��ư
			dispose();
			new MinYeong.LentalBook("�뿩����", 350, 450);
		}else if(obj==jb5) {	// ���� ��ư
			dispose();
		}
	}
	
}