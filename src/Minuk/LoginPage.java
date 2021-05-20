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
			
			//BD팬
			Container a = getContentPane();
			a.setLayout(new BorderLayout());
			
			//center (이미지 부분)	
			ImageIcon book = new ImageIcon("Intro.jpg");
			JLabel jl = new JLabel(book);
			a.add(jl);
			
			//south (로그인, 종료 버튼)
			Container c = new Container();
			
			loginBtn = new JButton("로그인");//로그인 버튼
			loginBtn.addActionListener(this);
			
			exitBtn = new JButton("종료");//종료 버튼
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
			
			//BD에 그리기
			a.add(jl,BorderLayout.NORTH);
			a.add(c,BorderLayout.SOUTH);
			
			
			setVisible(true);
		}
	
	
	public static void main(String[] args) {
		new LoginPage("관리자 로그인",940,430);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==loginBtn){
			if(idTf.getText().equals("admin")&&pwTf.getText().equals("1234")) {
				dispose();
			new MainPage();
			} else {
				JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 잘못되었습니다.","로그인 오류"
						,JOptionPane.ERROR_MESSAGE);
				idTf.setText("");
				pwTf.setText("");
			}
			
		}else if(obj==exitBtn) {
			System.exit(0);
		}
		
	}
}
