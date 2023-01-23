package b1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(500, 500);
			this.setLayout(new FlowLayout());
			
			JMenuBar menuBar = new JMenuBar();
			
			fileMenu = new JMenu("File");
			editMenu = new JMenu("Edit");
			helpMenu = new JMenu("Help");
			
			loadItem = new JMenuItem("Load");
			saveItem = new JMenuItem("Save");
			exitItem = new JMenuItem("Exit");
			
			loadItem.addActionListener(this);
			saveItem.addActionListener(this);
			exitItem.addActionListener(this);
			
			fileMenu.setMnemonic(KeyEvent.VK_F);//Alter + F
			editMenu.setMnemonic(KeyEvent.VK_E);//Alter + E
			helpMenu.setMnemonic(KeyEvent.VK_H);//Alter + H
			
			loadItem.setMnemonic(KeyEvent.VK_L);
			saveItem.setMnemonic(KeyEvent.VK_S);
			exitItem.setMnemonic(KeyEvent.VK_E);
			
			
			fileMenu.add(loadItem);
			fileMenu.add(saveItem);
			fileMenu.add(exitItem);
			
			menuBar.add(fileMenu);
			menuBar.add(editMenu);
			menuBar.add(helpMenu);
			
			this.setJMenuBar(menuBar);
			this.setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==loadItem) {
			System.out.println("Load Item");
		}
		if (e.getSource()==saveItem) {
			System.out.println("Save Item");
		}
		if (e.getSource()==exitItem) {
			System.exit(0);
		}
	}	
}
