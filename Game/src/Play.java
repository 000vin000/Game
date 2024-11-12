import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Monster monster = new Monster();
		Dice dice = new Dice();
		
		int count = 0;	// 몬스터 죽은 횟수
		System.out.println("게임 시작");
		
		while (user.getUserHp() > 0) {
			monster.setMonsterHp(dice.monsterDice());	// 몬스터 시작 체력
			System.out.println("--------------------\n몬스터 등장\n--------------------");
			while (monster.getMonsterHp() > 0 && user.getUserHp() > 0) {
				System.out.println("유저 체력 : " + user.getUserHp());		
				// 몬스터 체력
				System.out.println("몬스터 체력 : " + monster.getMonsterHp());
				
				System.out.print("공격 1 / 힐 2 > ");
				int select = sc.nextInt();
				if (select == 1) {					// 공격
					int monat = dice.playDice();
					user.setUserAttack(monat);
					System.out.println("\n유저 받은 피해량 : " + monat);
					int usat = dice.playDice();
					monster.setMonsterAttack(usat);
					System.out.println("몬스터 받은 피해량 : " + usat + "\n");
					if (monster.getMonsterHp() <= 0) System.out.println("--------------------\n몬스터 사망");
				} else if (select == 2) {			// 힐
					if (user.getUserHp() >= 30) System.out.println("\n이미 최대체력 입니다.\n");
					else { 
						int usheal = dice.playDice();
						user.setUserHeal(usheal);
						System.out.println("\n받은 힐량 : " + usheal);
					}
					int monat = dice.playDice();
					user.setUserAttack(monat);
					System.out.println("유저 받은 피해량 : " + monat + "\n");
				} else {							// 다시 선택
					System.out.println("\n다시 선택\n");
					continue;
				}
			}
			count++;
		}
		System.out.println("유저 사망");
		System.out.println("잡은 몬스터 수 : " + count + "\n");
		System.out.println("------------------\n게임종료\n------------------");
	}
}
