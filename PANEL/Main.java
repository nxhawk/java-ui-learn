package b1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] arg) {
		
		ImageIcon icon = new ImageIcon("icon.png");
		
		JLabel label = new JLabel();
		label.setText("hi");
		label.setIcon(icon);
		//label.setHorizontalAlignment(JLabel.CENTER);
		//label.setVerticalAlignment(JLabel.CENTER);
		label.setBounds(10, 200, 200, 50);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		//redPanel.setLayout(new BorderLayout());//use setHorizontal and setVe
		redPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Panels");
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		
		redPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}
}