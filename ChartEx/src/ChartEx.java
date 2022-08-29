import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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

public class ChartEx extends JFrame  {
   
   private MyPanel Panel = new MyPanel();
   
   private JPanel fruitPanel;
   
   ImageIcon search =null;
   
   JTextField appleJf = new JTextField(5);
   JTextField bananaJf = new JTextField(5);
   JTextField mangoJf = new JTextField(5);
   JTextField cherryJf = new JTextField(5);
   JButton startJb = null;
   
   JLabel appleJl = new JLabel("Apple"+"%");
   JLabel bananaJl = new JLabel("Banana"+"%");
   JLabel mangoJl = new JLabel("Mango"+"%");
   JLabel cherryJl = new JLabel("Cherry"+"%");
   
   static double appleAveInt;
   static double bananaAveInt;
   static double mangoAveInt;
   static double cherryAveInt;
   
	String appleAve;
	String bananaAve;
	String mangoAve;
	String cherryAve;
   
   int numApple;
   int numBanana;
   int numMango;
   int numCherry;
   int sum = 0;
   
   public ChartEx() {
      
   this.setTitle("PieChart");
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   Container c = getContentPane();
   search = new ImageIcon("images/search.png");
   Image img = search.getImage();
   Image img2 = img.getScaledInstance(30, 30, img.SCALE_SMOOTH);
   ImageIcon search2 = new ImageIcon(img2);
  
   startJb = new JButton(search2);
   startJb.setPressedIcon(search2);
   startJb.setRolloverIcon(search2);
   startJb.setPreferredSize(new Dimension(40, 40));
      
   fruitPanel = new JPanel();
   fruitPanel.add(new JLabel("apple"));
   fruitPanel.add(appleJf);
   fruitPanel.add(new JLabel("banana"));
   fruitPanel.add(bananaJf);
   fruitPanel.add(new JLabel("mango"));
   fruitPanel.add(mangoJf);
   fruitPanel.add(new JLabel("cherry"));
   fruitPanel.add(cherryJf);
   fruitPanel.add(startJb);
   
   Panel.add(appleJl, BorderLayout.NORTH);
   Panel.add(bananaJl);
   Panel.add(mangoJl);
   Panel.add(cherryJl);
   Panel.setBackground(Color.cyan);
   
   c.add(Panel,BorderLayout.CENTER);
   c.add(fruitPanel,BorderLayout.NORTH);
   
   startJb.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
         String strApple = appleJf.getText();
         numApple = Integer.parseInt(strApple);
         
         
         String strBanana = bananaJf.getText();
         numBanana = Integer.parseInt(strBanana);
         
         String strMango = mangoJf.getText();
         numMango = Integer.parseInt(strMango);
         
         String strCherry = cherryJf.getText();
         numCherry = Integer.parseInt(strCherry);
         
         sum = numApple + numBanana + numMango + numCherry;
         
         if(sum == 0) {
        	 return;
         }
         
         appleAveInt = 100*numApple/sum;
         bananaAveInt =100*numBanana/sum;
         mangoAveInt = 100*numMango/sum;
         cherryAveInt = 100*numCherry/sum;
         
         String appleAve = Integer.toString(100*numApple/sum);
         String bananaAve = Integer.toString(100*numBanana/sum);
         String mangoAve = Integer.toString(100*numMango/sum);
         String cherryAve = Integer.toString(100*numCherry/sum);
         
         appleJl.setText("Apple"+appleAve+"%");
         bananaJl.setText("Banana"+bananaAve+"%");
         mangoJl.setText("Mango"+mangoAve+"%");
         cherryJl.setText("Cherry"+cherryAve+"%");	
         
         Panel.repaint();
         
      }
   });
   
   this.setSize(600, 600);
   this.setVisible(true);
   
   }
   
   class MyPanel extends JPanel {

	   
      @Override
      protected void paintComponent(Graphics g) {
         
    	  super.paintComponent(g);
    	  
    	 int startA = 0;
    	  
         g.setColor(Color.red);
         g.fillArc(100, 100, 380, 380, startA, (int)Math.ceil((appleAveInt*3.6)));
         g.setColor(Color.blue);
         g.fillArc(100, 100, 380, 380, startA+(int)Math.ceil((appleAveInt*3.6)), (int)Math.ceil((bananaAveInt*3.6)));
         g.setColor(Color.black);
         g.fillArc(100, 100, 380, 380, startA+(int)Math.ceil(((appleAveInt+bananaAveInt)*3.6)), (int)Math.ceil((mangoAveInt*3.6)));
         g.setColor(Color.gray);
         g.fillArc(100, 100, 380, 380, startA+(int)Math.ceil(((appleAveInt+bananaAveInt+mangoAveInt)*3.6)), (int)Math.ceil((cherryAveInt*3.6)));
         
         repaint();
      }}
   
   public static void main(String[] args) {
      
      new ChartEx();

      
   }

}