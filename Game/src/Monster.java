public class Monster {
	Dice dice = new Dice();
	private int monsterAttack;
	private int monsterHp;
	
	public int getMonsterHp() { return monsterHp; }
	public void setMonsterHp(int monsterHp) { this.monsterHp = monsterHp; }
	
	public int getMonsterAttack() { return monsterAttack; }
	public void setMonsterAttack(int attack) { monsterHp -= attack; }
}
