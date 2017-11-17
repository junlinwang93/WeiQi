package Weiqi;
/*
 * @author Junlin Wang
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WeiqiPad extends JPanel implements MouseListener,ActionListener{
	private static final long serialVersionUID = 1L;
	int x=0,y=0;
	JButton bt=new JButton("Restart");
	TextField text=new TextField("Black's First Please");
	public  WeiqiPad() {	
		setSize(840,880);
		setLayout(null); 
		this.setBackground(Color.ORANGE);
		addMouseListener(this);
		add(bt);bt.setBounds(0, 0, 100, 40);
		bt.setVisible(true);
		bt.addActionListener(this);
		add(text);
		text.setEditable(false);
		//text.setForeground(Color.BLACK);
		text.setFont(new Font("TimesRoman",Font.PLAIN,20));
		//text.setBackground(Color.gray);
		text.setBounds(260, 20, 320, 40);
		setVisible(true);
	 }
	 ChessPoint cp=new ChessPoint(x,y);
  public void mousePressed(MouseEvent e) {
	if(e.getModifiers()==InputEvent.BUTTON1_MASK)  { 
		  Graphics g = getGraphics();	 
      x=(int)e.getX();y=(int)e.getY();
      cp.a=(x+20)/40;cp.b=(y+20)/40;
	  if(x/40<1||y/40<2||x/40>18||y/40>19){} 
	  else 
	  { 		  
	    cp.paint(g);
	    if(cp.ChessColor==1) {
	    	  text.setText("Now it is Black's Turn");
	    }
	    else{text.setText("Now it is White's Turn");}
		}
	}	
	  } 

	  public void mouseReleased(MouseEvent e){} 
	  public void mouseEntered(MouseEvent e){} 
	  public void mouseExited(MouseEvent e){} 
	  public void mouseClicked(MouseEvent e){
	  } 
	  public void actionPerformed(ActionEvent e) {
		   repaint();
		   ChessPoint.PointState=new int[20][21];
		   ChessPoint.ChessColor=1;
		   text.setText("Restart Game,Black First Please");
	  }
  public void paint(Graphics g){
		for(int i=80;i<=800;i+=40) {
			g.drawLine(40, i, 760, i);
		}
		for(int j=40;j<=760;j+=40) {
			g.drawLine(j, 80, j, 800);
		}
		g.fillOval(156,196,8,8);g.fillOval(396,196,8,8);g.fillOval(636,196,8,8);
		g.fillOval(156,436,8,8);g.fillOval(396,436,8,8);g.fillOval(636,436,8,8);
		g.fillOval(156,676,8,8);g.fillOval(396,676,8,8);g.fillOval(636,676,8,8);
  }
  public static void main(String[] args) {
    new WeiqiPad();
}
}

