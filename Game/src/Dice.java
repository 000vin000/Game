public class Dice {
	
	// 공격 회복 주사위
	public int playDice() {
		return (int)(Math.random() * 5) + 1;
	}
	
	// 몬스터 체력
	public int monsterDice() {
		return (int)(Math.random() * 20) + 1;
	}
}
