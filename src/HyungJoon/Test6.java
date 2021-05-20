package HyungJoon;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.tools.javac.Main;

public class Test6 extends JFrame implements ActionListener{
	JButton Onejbt1,Onejbt2;
	JTextField Onejt1,Onejt2;	
	public JPanel jp1;
	public Test6(String title,int width,int height) {
				setTitle(title);
				setSize(width, height);
				setDefaultCloseOperation(3);
				setLocationRelativeTo(null);
				setLayout(new FlowLayout());
				jp1 = new JPanel();
				jp1.setLayout(null);
				jp1.setBackground(Color.white);
				jp1.setPreferredSize(new Dimension(700, 400));
				ImageIcon img = new ImageIcon("imag/Intro.jpg");
				JLabel jl1 = new JLabel(img);
				jl1.setBounds(0,0,700,400);
				jl1.setPreferredSize(new Dimension(300, 400));
				jp1.add(jl1);
				JPanel Onejp2 = new JPanel();
				Onejp2.setPreferredSize(new Dimension(700, 100));
				Onejp2.setLayout(new FlowLayout());
				JLabel Onejl1 = new JLabel("ID: ");
				JLabel Onejl2 = new JLabel("PW: ");
				Onejt1 = new JTextField(10);
				Onejt2 = new JTextField(10);
				Onejbt1 = new JButton("로그인");
				Onejbt2 = new JButton("종료");
				Onejp2.add(Onejl1);
				Onejp2.add(Onejt1);
				Onejp2.add(Onejl2);
				Onejp2.add(Onejt2);
				Onejp2.add(Onejbt1);
				Onejp2.add(Onejbt2);
				
				Onejbt1.addActionListener(this);
				Onejbt2.addActionListener(this);
				add(jp1);
				add(Onejp2);
				setVisible(true);
				}
	public static void main(String[] args) {
		JFrame j = new JFrame();
		new Test6("관리자 로그인",700,500);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(obj==Onejbt1) {
				String id = Onejt1.getText();
				String pw = Onejt2.getText();
				if(id.equals("admin")&&pw.equals("1234")) {
					dispose();
					new Minuk.MainPage();
				}
			}
			if(obj==Onejbt2) {
				System.exit(0);
			}
	}

}