package b1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] arg) {
		JFrame frame = new JFrame();
		 
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
 
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
        // (10, 50):(gap, margin-top)
 
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.cyan);
        panel.setLayout(new FlowLayout());
 

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        
        frame.add(panel);
        frame.setSize(400, 250);
        frame.setVisible(true);
        frame.setTitle("Ví dụ FlowLayout trong Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}