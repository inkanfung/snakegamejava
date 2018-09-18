import java.awt.*;
import java.swing.*;

public class Main{
	
	
	public Main(){
		
		JFrame frame = new JFrame();
		Board snakeboard = new Board();
		
		frame.add(snakeboard);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.settitle("JAVASNAKEGAME");
		frame.pack();
		frame.setvisible(true);
		
		
		
	}
	
	
	public static void main(String[] args){
		
		
		new Main();
		
		
		
		
	}
	
	
}

