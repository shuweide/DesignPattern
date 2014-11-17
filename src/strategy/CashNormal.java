package strategy;
/**
 * 大話設計模式 Chapter2 策略模式 練習
 * @author shuwei
 *
 */
class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
