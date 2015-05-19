package src;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Battle extends JFrame {

	public JFrame frame;

	public JLabel selectionBox;
	public JLabel selectLabel;
	
	public JLabel attack1 = new JLabel("Attack1");
	public JLabel attack2 = new JLabel("Attack2");
	public JLabel attack3 = new JLabel("Attack3");
	public JLabel attack4 = new JLabel("Attack4");

	Color borderColor = new Color(223, 234, 216);
	Color selectorBg = new Color(24, 32, 204);
	
	ImageIcon select = new ImageIcon(getClass().getResource("white_arrow.png"));
	
	public Battle() {
		makeFrame();
		createBoxes();
		frame.setVisible(true);
		BMusic1 bm1 = new BMusic1();
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
		
		attack1.setBounds(50, 360, 100, 50);
		attack1.setForeground(Color.WHITE);
		frame.add(attack1);

		selectLabel = new JLabel(select);
		frame.add(selectLabel);
		selectLabel.setBounds(attack1.getX() - 45, attack1.getY(), 50, 50);
		
		selectionBox = new JLabel();
		selectionBox.setForeground(Color.white);
		Border border = BorderFactory.createLineBorder(borderColor, 5);
		selectionBox.setBorder(border);
		selectionBox.setBackground(selectorBg);
		selectionBox.setOpaque(true);
		selectionBox.setBounds(0, 344, 860, 166);
		frame.add(selectionBox);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}