package b1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(200, 200);
			this.setLayout(new FlowLayout());
			
			button = new JButton("Select file");
			button.addActionListener(this);
			
			this.add(button);
			this.setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("."));
			
			int ok = fileChooser.showOpenDialog(null);
			//showSaveDialog(null); => save with name
			if (ok == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsoluteFile()+"");				
				System.out.println(file);
			}
		}
	}	
}
