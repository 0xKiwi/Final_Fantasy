package src;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.Border;

public class Battle extends JFrame implements KeyListener{
	BMusic1 bm1 = new BMusic1();
	BMusic2 bm2 = new BMusic2();
	public SavedValues ochinchin = new SavedValues(512, 800);
	public CharacterRules charles;
	public JFrame frame;
	
	public JLabel status;
	public JLabel action;
	public JLabel selectionBox;
	public JLabel selectLabel;
	public JLabel bgr;
	public JLabel mage;
	public JLabel enemy;
	public JLabel mageHP = new JLabel("Mage      " + " /512");
	public JLabel enemyHP = new JLabel();
	
	public JLabel attack1 = new JLabel("Pie");
	public JLabel attack2 = new JLabel("Heal");
	public JLabel attack3 = new JLabel("Sand Attack");
	public JLabel attack4 = new JLabel("Harden");

	Color borderColor = new Color(223, 234, 216);
	Color selectorBg = new Color(24, 32, 204);
	
	ImageIcon select = new ImageIcon(getClass().getResource("white_arrow.png"));
	ImageIcon bg = new ImageIcon(getClass().getResource("Background.png"));
	ImageIcon mageIcon = new ImageIcon(getClass().getResource("black-mage.png"));
	ImageIcon enemyIcon = new ImageIcon(getClass().getResource("Enemy.gif"));
	
	public void start() {
		makeFrame();
		createBoxes();
		frame.setVisible(true);
		/*if((int)(Math.random() * 2 + 1) == 1)
			bm1.init();
		else
			bm2.init();
		*/
		frame.addKeyListener(this);
		//MoveToAttack attacktest = new MoveToAttack(420, 2, frame);
		//MoveToAttack healtest = new MoveToAttack(-420, 1, frame);
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
		mage = new JLabel(mageIcon);
		frame.add(mage);
		mage.setBounds(600,150,200,300);
		
		enemy = new JLabel(enemyIcon);
		frame.add(enemy);
		enemy.setBounds(0,-50,500,500);
		
		attack1.setBounds(50, 395, 200, 50);
		attack1.setForeground(Color.WHITE);
		attack1.setFont(attack1.getFont().deriveFont(16.0f));
		frame.add(attack1);
		
		attack2.setBounds(50, 445, 200, 50);
		attack2.setForeground(Color.WHITE);
		attack2.setFont(attack2.getFont().deriveFont(16.0f));
		frame.add(attack2);
		
		attack3.setBounds(340, 395, 200, 50);
		attack3.setForeground(Color.WHITE);
		attack3.setFont(attack3.getFont().deriveFont(16.0f));
		frame.add(attack3);
		
		attack4.setBounds(340, 445, 200, 50);
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
		selectionBox.setBounds(0, 377, 949, 136);
		frame.add(selectionBox);
		
		status = new JLabel();
		status.setForeground(Color.white);
		status.setBorder(border);
		status.setBackground(selectorBg);
		status.setOpaque(true);
		status.setBounds(600, 377, 349, 136);
		frame.add(status);
		
		JLayeredPane layer = new JLayeredPane();
		frame.setContentPane(layer);
		layer.add(mage, 3);
		layer.add(selectionBox, 2);
		layer.add(status, 2);
		layer.add(selectLabel, 0);
		layer.add(attack1, 1);
		layer.add(attack2, 1);
		layer.add(attack3, 1);
		layer.add(attack4, 1);
		layer.add(bgr, 5);
	}
	
	/// MAKE SOUND LOOOOP
	public void attackSelect(JLabel label){
		frame.remove(attack1);
		frame.remove(attack2);
		frame.remove(attack3);
		frame.remove(attack4);
		frame.remove(selectionBox);
		frame.remove(selectLabel);
		frame.remove(status);
		frame.repaint();
		
		action = new JLabel("You used " + label.getText() + "!");
		action.setForeground(Color.white);
		action.setFont(action.getFont().deriveFont(18.0f));
		action.setBounds(80, 345, 800, 200);
		frame.add(action);
		frame.add(selectionBox);
		JLayeredPane layered = new JLayeredPane();
		frame.setContentPane(layered);
		layered.add(action, 0);
		layered.add(selectionBox, 2);
		layered.add(bgr, 4);
		layered.add(status, 1);
		layered.add(mage, 3);
		if(label.getText().equals("Pie chance")){
			double k = (Math.random() * 10 + 1);
			if(k > 2){
				Character(1,ochinchin.playah(),ochinchin.enemi(), 1);
			}else
		Character(600,ochinchin.playah(),ochinchin.enemi(), 1);
		//pie chance
		}
		if(label.getText().equals("Pain")){
		Character(215,ochinchin.playah(),ochinchin.enemi(), 3);
		//pains
		}
		if(label.getText().equals("Lightning storm")){
		Character(150,ochinchin.playah(),ochinchin.enemi(), 4);
		//Lightning storm
		}
		if(label.getText().equals("Pie chance")){
		Character(-128,ochinchin.playah(),ochinchin.enemi(), 2);
		//heal
		}
		frame.setVisible(true);
	}
	public void Character(int d, int p, int e, int attack){
		if(attack == 1){
			charles.damageEnemy(d);
		}if(attack == 2){
			charles.damageEnemy(d);
		}if(attack == 3){
			charles.healPlayer(d);
		}if(attack == 4){
			charles.damageEnemy(d);
		}
	}
	
	@Override
	public void keyPressed(KeyEvent key) {
		if(key.getKeyCode() == KeyEvent.VK_ENTER){
			if(selectLabel.getX() == attack1.getX() - 45)
				attackSelect(attack1);
			if(selectLabel.getY() == attack2.getY())
				attackSelect(attack2);
			if(selectLabel.getX() == attack3.getX() - 45)
				attackSelect(attack3);
			if(selectLabel.getY() == attack4.getY())
				attackSelect(attack4);
		}
		else if(key.getKeyCode() == KeyEvent.VK_DOWN){
			if(selectLabel.getX() == attack1.getX() - 45)
				selectLabel.setLocation(attack2.getX() - 45, attack2.getY());
			if(selectLabel.getX() == attack3.getX() - 45)
				selectLabel.setLocation(attack4.getX() - 45, attack4.getY());
		}
		else if(key.getKeyCode() == KeyEvent.VK_RIGHT){
			if(selectLabel.getX() == attack1.getX() - 45)
				selectLabel.setLocation(attack3.getX() - 45, attack3.getY());
			if(selectLabel.getX() == attack2.getX() - 45)
				selectLabel.setLocation(attack4.getX() - 45, attack4.getY());
		}
		else if(key.getKeyCode() == KeyEvent.VK_LEFT){
			if(selectLabel.getX() == attack3.getX() - 45)
				selectLabel.setLocation(attack1.getX() - 45, attack1.getY());
			if(selectLabel.getX() == attack4.getX() - 45)
				selectLabel.setLocation(attack2.getX() - 45, attack2.getY());
		}
		else if(key.getKeyCode() == KeyEvent.VK_UP){
			if(selectLabel.getX() == attack2.getX() - 45)
				selectLabel.setLocation(attack1.getX() - 45, attack1.getY());
			if(selectLabel.getX() == attack4.getX() - 45)
				selectLabel.setLocation(attack3.getX() - 45, attack3.getY());
		}
		frame.setVisible(true);	
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
	public class CharacterRules {
		public int userHealth;
		public int enemyHealth;
		public int value;
		
		public CharacterRules(int damage, int pHealth, int eHealth){
			userHealth = pHealth;
			enemyHealth = eHealth;
			value = damage; 		}
		
		
		public void damageEnemy(int value2){
			value = value2;
			enemyHealth -= value;
			if(enemyHealth <= 0){
				enemyHealth = 0;
				End end = new End(true);
			}
			MoveToAttack kek = new MoveToAttack(value, 1, frame);
		}
		public void damagePlayer(int value2){
			value = value2;
			userHealth -= value;
			if(userHealth <= 0){
				userHealth = 0;
				End end = new End(false);
			}
			MoveToAttack kek = new MoveToAttack(value, 2, frame);
			
		}
		public void healPlayer(int value2){
			value = value2;
			userHealth -= value;
			if(userHealth > 572){
				userHealth = 572;
			}
			MoveToAttack kek = new MoveToAttack(value, 1, frame);
		}
		public int getPlayerHealth(){return userHealth;}
		public int getEnemyHealth(){return enemyHealth;}

	}

}