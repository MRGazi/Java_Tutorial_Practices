package gui.practice.tutorial;

import javax.swing.*;
import java.awt.*;

public class GuiTest3 extends JFrame {
	
	private JLabel label;
	private JButton button;
	private JTextField textField;
	
	
	public GuiTest3 () {
		setLayout(new FlowLayout ());
		
		label = new JLabel("Hi! I am JLabel:");
		add(label);
		
		textField = new JTextField(15);
		add(textField);
		
		button = new JButton("Gazi Click");
		add(button);
		
		
	}
	
	public static void window1() {
		GuiTest3 frame = new GuiTest3();
		frame.setTitle("This is Gazi Frame");
		frame.setVisible(true);
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 300);
		
		
		
	}

}
