package HyungJoon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class RentOrReturn extends JFrame implements ActionListener {
	JPanel jp1,jp2,jp3,jp4;
	JButton Bsch,BRent,BNew,BRe,BBack;
	JTextField	BJT,BTNum,BTWho,BTName,BTPrice,BTWhere,BTYN;
	public RentOrReturn(String title,int width,int height) {
		setTitle(title);
		setSize(width,height);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		//ù��° �г�
		jp1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel BNL = new JLabel("������");
		BJT = new JTextField(15);
		Bsch = new JButton("�˻�");
		Bsch.addActionListener(this);
		jp1.add(BNL);
		jp1.add(BJT);
		jp1.add(Bsch);
		
		//�ι�° �г�
		jp2.setLayout(null);
		jp2.setPreferredSize(new Dimension(600, 120));
		JLabel BNum = new JLabel("������ȣ");
		JLabel BName = new JLabel("����");
		JLabel BWho = new JLabel("�� ��");
		JLabel BWhere = new JLabel("���ǻ�");
		JLabel BPrice = new JLabel("�� ��");
		JLabel BYN = new JLabel("���⿩��");
		BNum.setBounds(40, 40, 50, 20);
		BName.setBounds(320, 40, 50, 20);
		BWho.setBounds(40, 65, 50, 20);
		BWhere.setBounds(320, 65, 50, 20);
		BPrice.setBounds(40, 90, 50, 20);
		BYN.setBounds(320, 90, 50, 20);
		
		 BTNum = new JTextField(30);
		BTName = new JTextField(30);
		BTWho = new JTextField(30);
		BTWhere = new JTextField(30);
		BTPrice = new JTextField(30);
		BTYN = new JTextField(30);
		BTNum.setBounds(90, 40, 90, 20);
		BTName.setBounds(370, 40, 90, 20);
		BTWho.setBounds(90, 65, 90, 20);
		BTWhere.setBounds(370, 65, 90, 20);
		BTPrice.setBounds(90, 90, 90, 20);
		BTYN.setBounds(370, 90, 90, 20);
	
		jp2.add(BNum);
		jp2.add(BName);
		jp2.add(BWho);
		jp2.add(BWhere);
		jp2.add(BPrice);
		jp2.add(BYN);
		
		jp2.add(BTNum);
		jp2.add(BTName);
		jp2.add(BTWho);
		jp2.add(BTWhere);
		jp2.add(BTPrice);
		jp2.add(BTYN);
		
		//3��°�г�
		jp3 = new JPanel();
		jp3.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp3.setPreferredSize(new Dimension(600, 45));
		BRent = new JButton("�뿩�ݳ�");
		BRent.addActionListener(this);
		BNew = new JButton("�ʱ�ȭ");
		BNew.addActionListener(this);
		BRe = new JButton("���ΰ�ħ");
		BBack = new JButton("���ư���");
		BBack.addActionListener(this);
		jp3.add(BRent);
		jp3.add(BNew);
		jp3.add(BRe);
		jp3.add(BBack);
		
		//4��° �г�
		jp4.setLayout(new GridLayout(1,1));
		String header[] = {"������ȣ","����","����"
				 ,"���ǻ�","����","���⿩��"};
		 String contents[][] = {};
		 
		 JTable JT = new JTable(contents,header);
		 JScrollPane scrollpane = new JScrollPane(JT);
				scrollpane.setPreferredSize(new Dimension(600, 400));
		 jp4.add(scrollpane);
		add(jp1);
		add(jp2);
		add(jp3);
		add(jp4);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		JFrame j = new JFrame();
		new RentOrReturn("�����뿩/�ݳ�",600,700);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==Bsch) {
//			for (int i = 0; i < v.size(); i++) {
//				if(())
//			}
		}
		if(obj==BRent) {
		new RenRe("�뿩/�ݳ�",480,500);
		}
		if(obj==BNew) {
			BJT.setText("");
			BTNum.setText("");
			BTWho.setText("");
			BTName.setText("");
			BTPrice.setText("");
			BTWhere.setText("");
			BTYN.setText("");
		}
		if(obj==BBack) {
			dispose();
			new Minuk.MainPage();
		}
		}
		
	

public class RenRe extends JFrame implements ActionListener {
	JTextField jt1,jt2,jt3;
	JButton jb1,jb2,jb3;
	public RenRe(String title,int width,int height) {
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(new FlowLayout());
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		//jp1
		jp1.setLayout(new FlowLayout());
		JLabel jl1 = new JLabel("ȸ���ֹι�ȣ");
		jt1 = new JTextField(10);
		jb1 = new JButton("�뿩");
		jb2 = new JButton("�ݳ�");
		jb3 = new JButton("���");
		jb3.addActionListener(this);
		jp1.add(jl1);
		jp1.add(jt1);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		add(jp1);
		
		//jp2
		jp2.setLayout(new FlowLayout());
		JLabel jl2 = new JLabel("������ȣ");
		jt2 = new JTextField(8);
		JLabel jl3 = new JLabel("�� ��");
		jt3 = new JTextField(8);
		jp2.add(jl2);
		jp2.add(jt2);
		jp2.add(jl3);
		jp2.add(jt3);
		add(jp2);
		
		//jp3
		jp3.setLayout(new FlowLayout());
		String[] header = {"�뿩��ȣ","ȸ���̸�","ȸ����ȭ","�����̸�","������ȣ","��¥"};
		String[][] contents = {};
		JTable jt = new JTable(contents,header);
		JScrollPane js = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
				, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jp3.add(js);
		add(jp3);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==jb3) {
			dispose();
		}
	}
}

}