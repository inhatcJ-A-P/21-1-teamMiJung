package Minuk;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserList_InfoRevise extends JFrame implements ActionListener {
	
	JButton jb1, jb2, jb3;
	JTextField tf1, tf2, tf3, tf4, tf5;
	
	public UserList_InfoRevise(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���̾ƿ�
		setLayout(new BorderLayout());
		Container b = getContentPane();
		
		//north
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		
		JLabel lbl1 = new JLabel("ȸ�� �ֹι�ȣ : ");
		tf1 = new JTextField(10);
		jb1 = new JButton("�˻�");
		jb1.addActionListener(this);
		
		jp1.add(lbl1);
		jp1.add(tf1);
		jp1.add(jb1);
		
		//center
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4,2));
		
		JLabel lbl2 = new JLabel("�̸� : ");
		tf2 = new JTextField();
		JLabel lbl3 = new JLabel("�ֹι�ȣ : ");
		tf3 = new JTextField();
		JLabel lbl4 = new JLabel("����ó : ");
		tf4 = new JTextField();
		JLabel lbl5 = new JLabel("�ּ� : ");
		tf5 = new JTextField();
		
		jp2.add(lbl2);
		jp2.add(tf2);
		jp2.add(lbl3);
		jp2.add(tf3);
		jp2.add(lbl4);
		jp2.add(tf4);
		jp2.add(lbl5);
		jp2.add(tf5);
		
		
		//south
		JPanel jp3 = new JPanel();
		jp3.setLayout(new FlowLayout());
		
		jb2 = new JButton("����");
		jb2.addActionListener(this);
		jb3 = new JButton("���ư���");
		jb3.addActionListener(this);
		
		jp3.add(jb2);
		jp3.add(jb3);
		
		//����
		b.add(jp1,BorderLayout.NORTH);
		b.add(jp2,BorderLayout.CENTER);
		b.add(jp3,BorderLayout.SOUTH);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jb1) {			//�˻�
			
		} else if(obj == jb2) {		//����
			
		} else if(obj == jb3) {		//���ư���
			dispose();
		}
		
	}


}