package src;

public class AttackFailed {
	
	public AttackFailed(int damage, int defender){
		MoveToAttack fail = new MoveToAttack(0, defender);
		HitOrMiss missed = new HitOrMiss(1);
	}
}
