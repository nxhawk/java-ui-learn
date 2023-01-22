package b1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	public Slider() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("Slider demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);// (min, max, value default)
		
		slider.setPreferredSize(new Dimension(400, 200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);//vach nho (khoang cach ko pk so vach)
		
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(25);//vach moc(lon, default)(khoang cach ko pk so vach)
		
		slider.setPaintLabels(true);//hien gia tri cua moc
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		slider.setOrientation(SwingConstants.VERTICAL);//direction
		//slider.setOrientation(SwingConstants.HORIZONTAL);//direction
		slider.addChangeListener(this);
		
		label.setText("oC = "+slider.getValue());
		label.setForeground(Color.GREEN);
		label.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420, 420);
		frame.setVisible(true);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		label.setText("oC = "+slider.getValue());
		if (slider.getValue() < 50) label.setForeground(Color.BLUE);
		else if (slider.getValue() > 50) label.setForeground(Color.RED);
		else label.setForeground(Color.GREEN);
	}
	
}
