package two;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Dsa extends JFrame {
	private JPanel jp1;
	private JPanel jpdep;
	private JLabel lbdep;
	private JButton btndep;
	public Dsa(String title,int width,int height) {
		setTitle(title);
		setSize(width, height);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		jp1 = new JPanel();
	      jpdep = new JPanel();
	      jpdep.setLayout(new GridLayout(0, 1));
	      lbdep = new JLabel("출발", SwingUtilities.CENTER);
	      btndep = new JButton();
	      btndep.setText("<HTML><body><h2><center>From</center></h2></body></HTML>");
	      btndep.setText("<HTML><body style ='text-align:center;'>From<br>출발지</body></HTML>");
	      btndep.setBackground(Color.white);
	      btndep.setBorderPainted(false);
	      jpdep.add(lbdep);
	      jpdep.add(btndep);
	      add(jpdep);
		setVisible(true);
	}
	public static void main(String[] args) {
		JFrame j = new JFrame();
		new Dsa("INHA AIR",300,300);
	}

}
