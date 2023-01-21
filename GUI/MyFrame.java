package b1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyFrame(){
		this.setTitle("Jthis title goes here");//title console
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit application when close console
		this.setResizable(false);//prevent this resize
		this.setSize(420, 420);//set width height screen
		this.setVisible(true);//visible console
		
		ImageIcon image = new ImageIcon("leaf.png");//curry path in ./b1
		this.setIconImage(image.getImage());// set icon image
		this.getContentPane().setBackground(Color.green);//change color background
		this.getContentPane().setBackground(new Color(222, 25, 24));//change color background

	}
}
