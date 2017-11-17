package Weiqi;
/*
 * @author Junlin Wang
 */
import java.awt.*;

public class ChessPoint extends Canvas{
	static int  ChessColor=1;
    int a=0;int b=0;
	public static int[][] PointState=new int[20][21]; 
     public ChessPoint(int x,int y) {    		
    	 a=(x+20)/40;b=(y+20)/40;
    	 	
     }
     public void paint(Graphics g){	 
    	super.paint(g);;
    	if(PointState[a][b]!=0){
    	}
    	else
    	if(ChessColor==1) {  	
        g.setColor(Color.black);
        g.fillOval(a*40-20,b*40-20,40,40);
        ChessColor=ChessColor*-1;
        PointState[a][b]=1;
       
    	}
    	
        else if(ChessColor==-1) {
        
        g.setColor(Color.white);
        g.fillOval(a*40-20,b*40-20,40,40);
        ChessColor=ChessColor*-1;
        PointState[a][b]=1;
        }
    	}}



