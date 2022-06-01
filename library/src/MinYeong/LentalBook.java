package MinYeong;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LentalBook extends JFrame implements ActionListener{
	JButton b1;
	public LentalBook(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		add(p1, BorderLayout.NORTH);
		b1 = new JButton("돌아가기");
		b1.addActionListener(this);
		p1.add(b1);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new LentalBook("대여정보", 350, 450);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == b1) {
			dispose();
			new Minuk.MainPage();
		}
	}

}