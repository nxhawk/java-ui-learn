package b1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JComboBox<String> comboBox;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog", "cat", "duck", "bird", "fish"};
		comboBox = new JComboBox<String>(animals);
		comboBox.addActionListener(this);
		
		comboBox.setEditable(true);//change text select by input
		//System.out.println(comboBox.getItemCount()); //length options 
		comboBox.addItem("horse");// add item
		comboBox.insertItemAt("pig", 1);
		//comboBox.setSelectedIndex(3);//default index and select this
		comboBox.removeItem("cat");
		comboBox.removeItemAt(2);
		//comboBox.removeAllItems();
		
		//System.out.println(comboBox.getItemCount()); //length options 
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());//Index, Item 
			System.out.println(comboBox.getSelectedIndex());//-1 if don't have
		}
	}
	
	
}
