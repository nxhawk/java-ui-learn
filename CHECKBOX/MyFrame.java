package b1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JCheckBox checkBox;
	ImageIcon xicon;
	ImageIcon checkicon;
	
	MyFrame(){
		xicon = new ImageIcon("xicon.png");
		checkicon = new ImageIcon("checkicon.png");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
				
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);// don't focus text
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 34));
		
		checkBox.setIcon(xicon);//default icon non select
		checkBox.setSelectedIcon(checkicon);//select => icon
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		this.add(checkBox);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
	}
	
	
}
