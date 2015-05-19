package src;

public class CharacterRules {
	public int userHealth;
	public int enemyHealth;
	public int value;
	
	public CharacterRules(int damage, int pHealth, int eHealth){
		userHealth = pHealth;
		enemyHealth = eHealth;
		value = damage;
	}
	
	
	public void damageEnemy(){
		enemyHealth -= value;
		if(enemyHealth <= 0){
			enemyHealth = 0;
			End end = new End(true);
		}
	}
	public void damagePlayer(){
		userHealth -= value;
		if(userHealth <= 0){
			userHealth = 0;
			End end = new End(false);
		}
	}
	public void healPlayer(){
		userHealth -= value;
		if(userHealth > 572){
			userHealth = 572;
		}
	}
	public int getPlayerHealth(){return userHealth;}
	public int getEnemyHealth(){return enemyHealth;}

}
