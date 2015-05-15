package src;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Battle extends JFrame {

	public JFrame frame;

	public JLabel selectionBox;

	public JTextField attack1;
	public JTextField attack2;
	public JTextField attack3;
	public JTextField attack4;

	Color borderColor = new Color(223, 234, 216);
	Color selectorBg = new Color(24, 32, 204);

	public Battle() {
		makeFrame();
		createBoxes();
	}

	public void makeFrame() {
		frame = new JFrame("Final Fantasy");
		frame.setAlwaysOnTop(true);
		frame.setBounds(500, 200, 960, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public void createBoxes() {
		selectionBox = new JLabel(" Stuff");
		selectionBox.setForeground(Color.white);
		Border border = BorderFactory.createLineBorder(borderColor, 5);
		selectionBox.setBorder(border);
		selectionBox.setBackground(selectorBg);
		selectionBox.setOpaque(true);
		selectionBox.setBounds(0, 344, 860, 166);
		frame.add(selectionBox);
	}
}
