package qa.JavaWk2Assesment_JackLawthom;

public abstract class Enemy {
	private int damage;

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void attack(Player player) {
		player.decreaseHealth(damage);		
	}

}
