package gui.practice.tutorial;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class GuiTest4 {
	
	public static JFrame frame;
	public static JPanel panel;
	public static JLabel label;
	public static JButton button;
	
	public GuiTest4(){
		window1();
	}
	
	public static void window1() {
		frame = new JFrame(" This is Java Frame");
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setLocation(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		
	}

}
