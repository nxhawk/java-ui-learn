package b1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] arg) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
        frame.setTitle("Ví dụ GridLayout trong Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 3, 10, 1));
        // (row, column, h-gap, v-gap)
        
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        
        frame.setVisible(true);
	}
}