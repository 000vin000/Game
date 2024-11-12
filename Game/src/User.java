
public class User {
	Dice dice = new Dice();
	
	private int userHp = 30;
	private int userAttack;	// 영웅 공격
	private int userHeal;	// 영웅 힐
	
	public int getUserHp() { return userHp; }
	public void setUserHp(int userHp) { this.userHp = userHp; }
	
	public int getUserAttack() { return userAttack; }
	public void setUserAttack(int attack) { userHp -= attack; }
	
	public void setUserHeal(int heal) { 
		userHp += heal;
		if (userHp >= 30) {
			userHp = 30;
			System.out.println("최대체력은 30 입니다.");
		}
	}	
}
