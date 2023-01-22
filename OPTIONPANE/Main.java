package b1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] arg) {
		
		JOptionPane.showMessageDialog(null, "This is some uneless info", "plain", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "hey this is ::D", "infomation", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "ready?", "question", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "You're computer has A VIRUS!!!", "warning", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Something wrong>>>", "error", JOptionPane.ERROR_MESSAGE);
		
						
		int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "Ask you", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(answer);//yes: 0, no: 1 , cancel: 2, close console: -1
		
		String name = JOptionPane.showInputDialog("What's your name?");
		if (name != null) System.out.println("Hello " + name);

		String[] option = {"No, you're awesome!", "thanks!", "*smile*", "LKK"};
		ImageIcon icon = new ImageIcon("icon.png");
		System.out.println(
	
				JOptionPane.showOptionDialog(
						null, 
						"You are awesome!", //message
						"secret message", //title
						JOptionPane.YES_NO_CANCEL_OPTION, //0
						JOptionPane.INFORMATION_MESSAGE, //0
						icon, //icon 
						option, //all button option
						0)//default??
				);
	}
}