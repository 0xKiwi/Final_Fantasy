package src;

public class MoveToAttack {
	public int defend;
	public MoveToAttack(int damage, int defender){
		defend = defender;
		if(damage != 0){
			Blast();
			HitOrMiss hit = new HitOrMiss(damage);
		}else{
			HitOrMiss missed = new HitOrMiss(1);
		}
	}
	public void Blast(){
		
	}
}
