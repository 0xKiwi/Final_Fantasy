package src;

public class AttackSuccessful {
	public AttackSuccessful(int damage, int defender){
		MoveToAttack fail = new MoveToAttack(damage, defender);
		HitOrMiss missed = new HitOrMiss(damage);
	}
}
