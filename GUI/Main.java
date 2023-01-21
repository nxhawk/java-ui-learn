package b1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] arg) {
		JFrame frame = new JFrame();//Frame
		frame.setTitle("JFrame title goes here");//title console
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit application when close console
		frame.setResizable(false);//prevent frame resize
		frame.setSize(420, 420);//set width height screen
		frame.setVisible(true);//visible console
		
		ImageIcon image = new ImageIcon("leaf.png");//curry path in ./b1
		frame.setIconImage(image.getImage());// set icon image
		frame.getContentPane().setBackground(Color.green);//change color background
		frame.getContentPane().setBackground(new Color(225, 215, 24));//change color background
	}
}