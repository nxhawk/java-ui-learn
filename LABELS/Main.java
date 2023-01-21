package b1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] arg) {
		ImageIcon image = new ImageIcon("icon.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
			
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		frame.setTitle("Hey you");
		frame.setVisible(true);
		
		
		JLabel label = new JLabel();
		label.setText("Bro, do you even code?");
		label.setIcon(image);//insert image
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		
		label.setForeground(new Color(0x00FF00));//set color text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));//set font of text
		label.setIconTextGap(100);//set gap image and text
		label.setBackground(Color.black);
		label.setOpaque(true);//display background color
		label.setBorder(border);//add border 
		label.setVerticalAlignment(JLabel.CENTER);//label position vertical
		label.setHorizontalAlignment(JLabel.CENTER);//label position horizontal
		//label.setBounds(20, 10, 300, 500);//set label index (x, y, width, height)
		//frame.setLayout(null);//use setBounds
		//add setLayout to use this
		
		frame.add(label);
		frame.pack();//after .add
		frame.setIconImage(image.getImage());
	}
}