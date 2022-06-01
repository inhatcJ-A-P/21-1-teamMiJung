package Minuk;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
	
	public class LoginPage extends JFrame implements ActionListener{
		JButton loginBtn, exitBtn;
		JTextField idTf, pwTf;
		public LoginPage(String title, int width, int height) {
			setTitle(title);
			setSize(width, height);
			setLocationRelativeTo(this);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//BD��
			Container a = getContentPane();
			a.setLayout(new BorderLayout());
			
			//center (�̹��� �κ�)	
			ImageIcon book = new ImageIcon("Intro.jpg");
			JLabel jl = new JLabel(book);
			a.add(jl);
			
			//south (�α���, ���� ��ư)
			Container c = new Container();
			
			loginBtn = new JButton("�α���");//�α��� ��ư
			loginBtn.addActionListener(this);
			
			exitBtn = new JButton("����");//���� ��ư
			exitBtn.addActionListener(this);
			
			idTf = new JTextField(15);
			pwTf = new JTextField(15);
			
			c.setLayout(new FlowLayout());
			c.add(new JLabel("ID : "));
			c.add(idTf);
			c.add(new JLabel("PW : "));
			c.add(pwTf);
			c.add(loginBtn);
			c.add(exitBtn);
			
			//BD�� �׸���
			a.add(jl,BorderLayout.NORTH);
			a.add(c,BorderLayout.SOUTH);
			
			
			setVisible(true);
		}
	
	
	public static void main(String[] args) {
		new LoginPage("������ �α���",940,430);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==loginBtn){
			if(idTf.getText().equals("admin")&&pwTf.getText().equals("1234")) {
				dispose();
			new MainPage();
			} else {
				JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.","�α��� ����"
						,JOptionPane.ERROR_MESSAGE);
				idTf.setText("");
				pwTf.setText("");
			}
			
		}else if(obj==exitBtn) {
			System.exit(0);
		}
		
	}
}
