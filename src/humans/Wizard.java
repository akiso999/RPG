
package humans;

import bases.Human;
import utils.Dice;

//Humanクラスを継承するWizardクラス
public class Wizard extends Human {
	// コンストラクタ
	public Wizard(String name, String weapon) {
		// Humanクラスで定義したコンストラクタを利用する
		super(name, weapon);
		
		// ヒットポイントは定められた範囲の乱数で決める
		super.hp = Dice.get(120, 180); 
		// 攻撃力は定められた範囲の乱数で決める
		super.offensive = Dice.get(12, 18);
	}
}