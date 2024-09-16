
package monsters;

import bases.Monster;
import utils.Dice;

//Monsterクラスを継承するOakクラス
public class Oak extends Monster {

	// コンストラクタ
	public Oak(String name, String weapon) {
		// Monsterクラスで定義したコンストラクタを利用する
		super(name,weapon);
		// ヒットポイントは定められた範囲の乱数で決める
		super.hp = Dice.get(170, 230); 
		// 攻撃力は定められた範囲の乱数で決める
		super.offensive = Dice.get(9, 15);
		
	}

}