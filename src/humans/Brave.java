
package humans;

import bases.Human;
import utils.Dice;

//Humanクラスを継承するBraveクラス
public class Brave extends Human {
	// コンストラクタ
	public Brave(String name, String weapon) {
		// Humanクラスで定義したコンストラクタを利用する
		super(name, weapon);
		// ヒットポイントは定められた範囲の乱数で決める
		super.hp = Dice.get(170, 230); 
		// 攻撃力は定められた範囲の乱数で決める
		super.offensive = Dice.get(7, 13);
	}
}