
import javax.swing.*;

public class Main{
	
	
	public Main(){
		
		JFrame frame = new JFrame();
		Board snakeboard = new Board();
		
		frame.add(snakeboard);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("JAVASNAKEGAME");
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
	}
	
	
	public static void main(String[] args){
		
		
		new Main();
		
		
		
		
	}
	
	
}

