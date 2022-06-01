import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tet extends JFrame {
	JTextField first,second,correct;
	JComboBox<String> jc ;
	String[] s = {"+","-","*","/"};
	JButton answer,push,ext;
	public tet(String title,int width,int height) {
		setTitle(title);
		setSize(width, height);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.setBackground(Color.yellow);
		jp1.setPreferredSize(new Dimension(300,30));
		JLabel jl1 = new JLabel("201745016/2-A/박형준");
		jp1.add(jl1);
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		first = new JTextField();
		second = new JTextField(5);
		correct = new JTextField(5);
		
		jc = new JComboBox<>(s);
		
		answer = new JButton("=");
		push = new JButton("옮기기");
		ext = new JButton("exit");

		first.setPreferredSize(new Dimension(40,40));
		second.setPreferredSize(new Dimension(40,40));
		correct.setPreferredSize(new Dimension(40,40));
		jc.setPreferredSize(new Dimension(40,40));
		answer.setPreferredSize(new Dimension(50,40));
		push.setPreferredSize(new Dimension(100,40));
		ext.setPreferredSize(new Dimension(60,40));
		
		jp2.add(first);
		jp2.add(jc);
		jp2.add(second);
		jp2.add(answer);
		jp2.add(correct);
		jp2.add(push);
		jp2.add(ext);
		
		
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		JFrame j = new JFrame();
		new tet("ㄴㄴ",300,300);
	}

}
