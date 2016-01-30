package cwahler.GeneticAI;

import javax.swing.*;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
	public MainFrame() {
		layoutFrame();
		setVisible(true);
	}
	
	public void layoutFrame() {
		setSize(800, 600);
		setTitle("GeneticAI");
		
	}
	
}
