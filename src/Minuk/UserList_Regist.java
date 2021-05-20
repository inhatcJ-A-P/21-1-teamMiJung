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
		
		setTitle("회원등록");
		setSize(280,200);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(3);
	
		//기본
		Container b = getContentPane();
		b.setLayout(new BorderLayout());
		
		//north 구현
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.black);
		JLabel lbl1 = new JLabel("회원등록");
		lbl1.setForeground(Color.white);
		jp1.add(lbl1);
		
		//center 구현
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4,2));
		JLabel lbl2 = new JLabel("이름 : ");
		JLabel lbl3 = new JLabel("주민번호 : ");
		JLabel lbl4 = new JLabel("연락처 : ");
		JLabel lbl5 = new JLabel("주소 : ");
		
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
		
		//south 구현
		JPanel jp3 = new JPanel();
		
		jb1 = new JButton("확인");
		jb1.addActionListener(this);
		jb2 = new JButton("취소");
		jb2.addActionListener(this);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//실행
		b.add(jp1,BorderLayout.NORTH);
		b.add(jp2,BorderLayout.CENTER);
		b.add(jp3,BorderLayout.SOUTH);
		
		setVisible(true);
		
 }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==jb1) {			//확인
			JOptionPane.showMessageDialog(null, "입력이 완료되었습니다.","메시지",
					JOptionPane.INFORMATION_MESSAGE);
		}else if(obj==jb2) {	//취소
			dispose();
		}
	}
	
}