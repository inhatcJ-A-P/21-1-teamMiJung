import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyFrame extends JFrame implements MouseListener, ActionListener{
   String[] num = {"1A", "2A", "3A", "4A", "5A", "6A" };
   private JList<String> lst;
   private JPanel p1, p2, p3;
   private JButton btn;
   private LineBorder border;
   private JLabel[] lb;
   private DefaultListModel<String> m;
   int [] cnt = new int[6];
   public MyFrame(String title, int width, int height) {
      setTitle(title);
      setSize(width, height);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(this);
      
      p1 = new JPanel();
      add(p1, BorderLayout.NORTH);
      
      p1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
      
      m = new DefaultListModel<String>();
      m.addElement("1호차");
      m.addElement("2호차");
      m.addElement("3호차");
      m.addElement("4호차");
      m.addElement("5호차");
      m.addElement("6호차");
      m.addElement("7호차");
      m.addElement("8호차");
      
      lst = new JList<String>(m);
      JScrollPane sp = new JScrollPane(lst);
      lst.setVisibleRowCount(1);
      p1.add(sp);
      
      p2 = new JPanel();
      add(p2, BorderLayout.CENTER);
      
      p2.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
      
      border = new LineBorder(Color.BLACK, 1);
      
      lb = new JLabel[num.length];
      
      for(int i=0; i<num.length; i++) {
         lb[i] = new JLabel(num[i]);
         
         lb[i].setBorder(border);
         lb[i].setPreferredSize(new Dimension(70, 70));
         lb[i].setHorizontalAlignment(JLabel.CENTER);
         lb[i].setOpaque(true);
         p2.add(lb[i]);
         lb[i].addMouseListener(this);
      }
      
      
      p3 = new JPanel();
      add(p3, BorderLayout.SOUTH);
      
      btn = new JButton("선택완료");
      p3.add(btn);
      btn.addActionListener(this);
      
      setVisible(true);
   }

   public static void main(String[] args) {
      new MyFrame("좌석선택", 200, 400);
   }


   @Override
   public void mouseClicked(MouseEvent e) {
      }

   @Override
   public void mousePressed(MouseEvent e) {

	      Object obj = e.getSource();
	      for(int i=0; i<num.length; i++) {
	         if(obj == lb[i]) {
	        	 if(cnt[i]==1) {
			        	lb[i].setBackground(new Color(240, 240, 240));
			        	cnt[i]=0;
			        }
	        	 else {
	        	 lb[i].setBackground(Color.PINK);     
	            cnt[i]=1;}
	         }
	        
	      }
	      
	   
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      for(int i=0; i<num.length; i++) {
         if(obj == btn) {
            JOptionPane.showMessageDialog(null, "좌석을 선택해주세요.", "메시지", JOptionPane.INFORMATION_MESSAGE);
         }
      }


}
}