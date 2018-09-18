import java.awt.*;
import javax.swing.*;
//import java.util.*;

public class Board extends JPanel implements Runnable{
	
	
	int board_height = 700;
	int board_width = 700;
	Thread thread;
	boolean isrunning; 
	Timer timer;
	
	public Board(){
		
		
		setPreferredSize(new Dimension(board_width,board_height));
		
		
		
	}
	
	
	
	public void startgame(){
		isrunning = true;
		//running parallel to the main()
		thread = new Thread(this);
		thread.start();
		
	}
	
	public void endgame(){
		isrunning = false;
		try {
			//cause current thread to pause and this thread terminates
			thread.join()
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
		
	}
	
	public void tick(){
		
		
		
	}
	
	
	public void paint(Graphics a){
		
		//this functions clears the rectangle 
		a.clearRect(0,0,board_width,board_height);
		//sets color to black
		a.setColor(Color.BLACK);
		//fills rectangle to black
		a.fillRect(0,0,board_width,board_height);
			
			
			
			
		// https://chortle.ccsu.edu/java5/Notes/chap36/ch36_9.html
		//apparently draws a grid
		for(int i = 0; i < board_width/10 ; i++){
			
			a.drawLine(i*10, 0,i *10,board_height);
		}
		for(int i = 0; i < board_height/10; i++ ){
			
			a.drawLine(0, i*10, board_height,i*10);
			
		}
		
		
	}
	
	public void run(){
		
		
	}
	
	
	
}

