package gui.practice.tutorial;

import javax.swing.*;
import java.awt.*;

public class GuiTest1 {
	
	int l = 800; //length;
	int w = 600; // width;
	
	
	
	public GuiTest1() {
		guiTest();
	}
	
	public void guiTest() {
		
		JFrame frame = new JFrame("Welcome to Gazi Java Frame");
		frame.setVisible(true);
		frame.setSize(l, w);
		frame.setLocation(l, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label_1 = new JLabel("This is JLabel One: ");
		JLabel label_2 = new JLabel("This is JLabel Two: ");
		label_1.setAlignmentX(0);
		label_1.setAlignmentY(0);
		label_2.setAlignmentX(100);
		label_2.setAlignmentY(50);
		
		JPanel panel = new JPanel();
		panel.setVisible(true);
		//panel.setBackground(Color.green);
		panel.setPreferredSize(new Dimension(400,300));
		
		panel.add(label_1);
		panel.add(label_2);
		
		
		frame.add(panel);
	}
}


