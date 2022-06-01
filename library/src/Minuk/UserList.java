package Minuk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class UserList extends JFrame implements ActionListener {
	
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	
	public UserList() {
		
		setTitle("ȸ�����");
		setSize(500,550);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(3);
	
		//�⺻
		Container b = getContentPane();
		b.setLayout(new BorderLayout());
		
		//center���� 
		Container fl = new Container();
		fl.setLayout(new FlowLayout());
		
		jb1 = new JButton("���ΰ�ħ");
		jb1.addActionListener(this);
		
		jb2 = new JButton("���");
		jb2.addActionListener(this);
		
		jb3 = new JButton("��ȸ");
		jb3.addActionListener(this);
		
		jb4 = new JButton("����");
		jb4.addActionListener(this);
		
		jb5 = new JButton("����");
		jb5.addActionListener(this);
		
		jb6 = new JButton("���ư���");
		jb6.addActionListener(this);
		
		fl.add(jb1);
		fl.add(jb2);
		fl.add(jb3);
		fl.add(jb4);
		fl.add(jb5);
		fl.add(jb6);
		
		//south ����
		JPanel f2 = new JPanel();
		f2.setLayout(new BorderLayout());
		TitledBorder tb = new TitledBorder(new LineBorder(Color.BLACK),"ȸ�����");
		
		String header[] = {"�̸�","�ֹι�ȣ","��ȭ��ȣ","�ּ�"};
		String data[][] = {
			{"�̽���","001010","010-9879-4560","���� ������"},
			{"�����","770105","010-0689-3139","���ֽ� ��������"},
			{"��ȫ��","780107","010-7175-1459","����� ������"},
			{"ȫ�浿","791010","010-2536-7879","��� û�ֽ�"},
			{"��ȿ��","810513","010-4238-4561","�泲 ��õ��"}
		};
		
		JTable jt = new JTable(data,header);
		JScrollPane jp = new JScrollPane(jt);
		
		f2.add(jp);
		f2.setBorder(tb);
		
		//��ü ������ ����
		b.add(fl);
		b.add(f2,BorderLayout.SOUTH);
		setVisible(true);
		
 }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==jb1) {			//���ΰ�ħ
			
		}else if(obj==jb2) {	//���
			new UserList_Regist();
		}else if(obj==jb3) {	//��ȸ
			new UserList_Serch();
		}else if(obj==jb4) {	//����
			new UserList_InfoRevise("ȸ������ ����",300,200);
		}else if(obj==jb5) {	//����
			new UserList_Delete();
		}else if(obj==jb6) {	//���ư���
			dispose();
			new MainPage();
		}
	}
	
}