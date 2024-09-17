
package humans;

import bases.Human;
import utils.Dice;

//Humanクラスを継承するFighterクラス
public class Fighter extends Human {
	// コンストラクタ
	public Fighter(String name, String weapon) {
		// Humanクラスで定義したコンストラクタを利用する
		super(name,weapon);
		
		// ヒットポイントは定められた範囲の乱数で決める
		super.hp = Dice.get(240, 300); 
		// 攻撃力は定められた範囲の乱数で決める
		super.offensive = Dice.get(17, 23);
	}
}