
package monsters;

import bases.Monster;
import utils.Dice;

//Monsterクラスを継承するDragonクラス
public class Dragon extends Monster {

	// コンストラクタ
	public Dragon(String name, String weapon) {
		// Monsterクラスで定義したコンストラクタを利用する
		super(name,weapon);
		// ヒットポイントは定められた範囲の乱数で決める
		super.hp = Dice.get(270, 330); 
		// 攻撃力は定められた範囲の乱数で決める
		super.offensive = Dice.get(12, 18);
		
	}

}