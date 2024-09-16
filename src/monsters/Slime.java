
package monsters;

import bases.Monster;
import utils.Dice;

//Monsterクラスを継承するSlimeクラス
public class Slime extends Monster {

	// コンストラクタ
	public Slime(String name, String weapon) {
		// Monsterクラスで定義したコンストラクタを利用する
		super(name,weapon);
		// ヒットポイントは定められた範囲の乱数で決める
		super.hp = Dice.get(70, 130); 
		// 攻撃力は定められた範囲の乱数で決める
		super.offensive = Dice.get(5, 11);
		
	}

}