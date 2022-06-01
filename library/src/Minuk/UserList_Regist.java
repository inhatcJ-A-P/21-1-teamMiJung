package Minuk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
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


public class UserList_Regist extends JFrame implements ActionListener {
	
	JButton jb1, jb2;
	JTextField tf1, tf2, tf3, tf4;
	
	public UserList_Regist() {
		
		setTitle("ȸ�����");
		setSize(280,200);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(3);
	
		//�⺻
		Container b = getContentPane();
		b.setLayout(new BorderLayout());
		
		//north ����
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.black);
		JLabel lbl1 = new JLabel("ȸ�����");
		lbl1.setForeground(Color.white);
		jp1.add(lbl1);
		
		//center ����
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4,2));
		JLabel lbl2 = new JLabel("�̸� : ");
		JLabel lbl3 = new JLabel("�ֹι�ȣ : ");
		JLabel lbl4 = new JLabel("����ó : ");
		JLabel lbl5 = new JLabel("�ּ� : ");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		
		jp2.add(lbl2);
		jp2.add(tf1);
		jp2.add(lbl3);
		jp2.add(tf2);
		jp2.add(lbl4);
		jp2.add(tf3);
		jp2.add(lbl5);
		jp2.add(tf4);
		
		//south ����
		JPanel jp3 = new JPanel();
		
		jb1 = new JButton("Ȯ��");
		jb1.addActionListener(this);
		jb2 = new JButton("���");
		jb2.addActionListener(this);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//����
		b.add(jp1,BorderLayout.NORTH);
		b.add(jp2,BorderLayout.CENTER);
		b.add(jp3,BorderLayout.SOUTH);
		
		setVisible(true);
		
 }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==jb1) {			//Ȯ��
			JOptionPane.showMessageDialog(null, "�Է��� �Ϸ�Ǿ����ϴ�.","�޽���",
					JOptionPane.INFORMATION_MESSAGE);
		}else if(obj==jb2) {	//���
			dispose();
		}
	}
	
}