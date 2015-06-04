package src;

public class CharacterRules {
	public int userHealth = 712;
	public int enemyHealth = 1200;
	public int value;

	public void damageEnemy(int value2) {
		enemyHealth -= value2;
		if (enemyHealth <= 0) 
			enemyHealth = 0;
	}

	public void damagePlayer(int value2) {
		userHealth -= value2;
		if (userHealth <= 0)
			userHealth = 0;
	}

	public void healPlayer(int value2) {
		userHealth += value2;
		if (userHealth > 512)
			userHealth = 512;
	}

	public int getPlayerHealth() {
		return userHealth;
	}

	public int getEnemyHealth() {
		return enemyHealth;
	}

}