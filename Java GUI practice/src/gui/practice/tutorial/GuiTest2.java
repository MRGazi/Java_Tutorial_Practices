package gui.practice.tutorial;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class GuiTest2 extends JFrame {
	private static final int WIDTH = 600;
	private static final int HIGHT = 500;
	private static final int POSITION_X = 300;
	private static final int POSTION_Y = 300;
	private static final int LPOSITION_X = 0;
	private static final int LPOSTION_Y = 0;
	
	private static JFrame frame;
	private static JLabel label;
	private static JButton button;
	private static JPanel panel;
	
	public GuiTest2() {
		window1();
	}
	
	public static void window1() {
		frame = new JFrame("Helo! This Gazi JFrame");
		frame.setVisible(true);
		frame.setSize(WIDTH, HIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(POSITION_X, POSTION_Y);
		
		panel.setSize(400, 400);
		panel.setVisible(true);
		
		
		label = new JLabel("Helo! This is Gazi JLabel:");
		label.setBackground(Color.blue);
		
		
		button = new JButton("Gazi Button");
		label.add(button);
		
		panel.add(label);
		panel.add(button);
		
		frame.add(panel);
		
		
		
		
	}

}
