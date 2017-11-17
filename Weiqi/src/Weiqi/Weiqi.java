package Weiqi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Weiqi extends JFrame{
	/**
	 * @author Junlin Wang
	 */
	private static final long serialVersionUID = -2748054483582261121L;
	WeiqiPad Pad=new WeiqiPad();
	private void handleEvents() {
		addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
 
			@Override
			public void windowClosing(WindowEvent arg0) {
				int result = JOptionPane.showConfirmDialog(Weiqi.this, "Quit?",
				        "alert", JOptionPane.OK_CANCEL_OPTION);
				System.out.println(result);
				if (result == 0)
					System.exit(0);
				setVisible(true);
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	public Weiqi() {
		super("Weiqi Game");
		Container c = getContentPane();
		setSize(840,880);
		setBackground(Color.orange);
		c.add(Pad);
		handleEvents();
		setVisible(true); 
	}
	public static void main(String[] args) {		
        new Weiqi();
    }
	 
}
