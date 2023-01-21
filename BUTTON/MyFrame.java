package b1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	boolean flag;
	
	MyFrame(){
		ImageIcon icon = new ImageIcon("icon.png");
		ImageIcon icon2 = new ImageIcon("icon.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(170, 180, 200, 100);
		label.setVisible(false);
		flag = false;//hide or show label when click button
		
		button = new JButton();
		button.setBounds(100, 100, 200, 100);
		button.addActionListener(this);
		button.setText("I'm a button");
		button.setFocusable(false);//non outline when click button (have text)
		button.setIcon(icon);//add icon in button
		//button.addActionListener(e -> System.out.println("clicked"));
		
		button.setHorizontalTextPosition(JButton.CENTER);//text position
		button.setVerticalTextPosition(JButton.BOTTOM);//text position
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));//font text
		button.setIconTextGap(-10);//gap icon vs text 
		button.setForeground(Color.red);//text color
		button.setBackground(Color.green);//background color
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false);//none button
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			//System.out.println("poooo");
			flag = !flag;
			label.setVisible(flag);
		}
		
	}
}
