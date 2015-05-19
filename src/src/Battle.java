package src;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Battle extends JFrame implements KeyListener{

	public JFrame frame;

	public JLabel selectionBox;
	public JLabel selectLabel;
	public JLabel bgr;
	
	public JLabel attack1 = new JLabel("Attack1");
	public JLabel attack2 = new JLabel("Attack2");
	public JLabel attack3 = new JLabel("Attack3");
	public JLabel attack4 = new JLabel("Attack4");

	Color borderColor = new Color(223, 234, 216);
	Color selectorBg = new Color(24, 32, 204);
	
	ImageIcon select = new ImageIcon(getClass().getResource("white_arrow.png"));
	ImageIcon bg = new ImageIcon(getClass().getResource("Background.png"));
	
	public Battle() {
		makeFrame();
		createBoxes();
		frame.setVisible(true);
		BMusic1 bm1 = new BMusic1();
		frame.addKeyListener(this);
	}

	public void makeFrame() {
		frame = new JFrame("Final Fantasy");
		bgr = new JLabel(bg);
		frame.setContentPane(bgr);	
		frame.setAlwaysOnTop(true);
		frame.setBounds(500, 200, 960, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void createBoxes() {
		attack1.setBounds(50, 370, 100, 50);
		attack1.setForeground(Color.WHITE);
		attack1.setFont(attack1.getFont().deriveFont(16.0f));
		frame.add(attack1);
		
		attack2.setBounds(50, 430, 100, 50);
		attack2.setForeground(Color.WHITE);
		attack2.setFont(attack2.getFont().deriveFont(16.0f));
		frame.add(attack2);
		
		attack3.setBounds(340, 370, 100, 50);
		attack3.setForeground(Color.WHITE);
		attack3.setFont(attack3.getFont().deriveFont(16.0f));
		frame.add(attack3);
		
		attack4.setBounds(340, 430, 100, 50);
		attack4.setForeground(Color.WHITE);
		attack4.setFont(attack4.getFont().deriveFont(16.0f));
		frame.add(attack4);

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

	@Override
	public void keyPressed(KeyEvent key) {
		if(key.getKeyCode() == KeyEvent.VK_DOWN){
			if(selectLabel.getX() == attack1.getX() - 45)
				selectLabel.setLocation(attack2.getX() - 45, attack2.getY());
			if(selectLabel.getX() == attack3.getX() - 45)
				selectLabel.setLocation(attack4.getX() - 45, attack4.getY());
		}

		if(key.getKeyCode() == KeyEvent.VK_RIGHT){
			if(selectLabel.getX() == attack1.getX() - 45)
				selectLabel.setLocation(attack3.getX() - 45, attack3.getY());
			if(selectLabel.getX() == attack2.getX() - 45)
				selectLabel.setLocation(attack4.getX() - 45, attack4.getY());
		}

		if(key.getKeyCode() == KeyEvent.VK_LEFT){
			if(selectLabel.getX() == attack3.getX() - 45)
				selectLabel.setLocation(attack1.getX() - 45, attack1.getY());
			if(selectLabel.getX() == attack4.getX() - 45)
				selectLabel.setLocation(attack2.getX() - 45, attack2.getY());
		}

		if(key.getKeyCode() == KeyEvent.VK_UP){
			if(selectLabel.getX() == attack2.getX() - 45)
				selectLabel.setLocation(attack1.getX() - 45, attack1.getY());
			if(selectLabel.getX() == attack4.getX() - 45)
				selectLabel.setLocation(attack3.getX() - 45, attack3.getY());
		}
		frame.setVisible(true);
			
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}