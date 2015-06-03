package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;



public class MoveToAttack extends Battle{
	/*
	public ImageIcon heal = new ImageIcon(getClass().getResource("HealToFix.png"));
	public JLabel HH = new JLabel(heal);
	public ImageIcon blas = new ImageIcon(getClass().getResource("Pie.gif"));
	public JLabel BB = new JLabel(blas);
	public Timer t = new Timer(1, new ActionTimerDamage());
	public Timer k = new Timer(1, new ActionTimerHeal());
	public JFrame frm;
	public int defend;
	public int counter = 0;
	public int dam;
	public int x;
	public int y;
	public boolean attacked = false;
	public MoveToAttack(int damage, int defender, JFrame frame){
		frm = frame;
		defend = defender;
		dam = damage;
		if(defend == 1){
			x = 600;
			y = 150;
		}else if(defend == 2){
			x = 0;
			y = -50;
		}
		BB.setBounds(500, 100, 360, 218);
		HH.setBounds(x-350, y-250, 900, 900);
		if(dam > 0){
			Blast();
			HitOrMiss hit = new HitOrMiss(dam);
		}else if(dam == 0){
			HitOrMiss missed = new HitOrMiss(1);
		}else if(damage < 0){
			Heal();
		}
				
	}
	public void Move(int defendur, int damaged, boolean attack){
		
	}
	public void Blast(){
		if(defend == 2){
			BB.setLocation(100, 100);
		}else if(defend == 1){
			BB.setLocation(550,150);
		}
		t.start();
		
	}
	public void Heal(){
		Heal heil = new Heal();
		k.start();
		
	}
	public class ActionTimerDamage implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if(counter >= 2000){
				t.stop();
			}else if(counter > 900 && counter <= 1100){
				frm.add(BB);
				if(counter == 1100){
					attacked = true;
					frm.remove(BB);
					frm.setVisible(false);
					frm.setVisible(true);
				}
			}else{
				Move(defend, dam, attacked);
			}
			counter++;
			}
			
		}
	public class ActionTimerHeal implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if(counter >= 10000){
				frm.remove(HH);
				BMusic1 kek = new BMusic1();
				k.stop();
			}else{
				frm.add(HH);
			}
			counter++;
			}
			
		}
	*/
}
