package strategy;
/**
 * 大話設計模式 Chapter2 策略模式 練習
 * @author shuwei
 *
 */
class CashRebate extends CashSuper {

	private double moneyRebate = 1d;
	public CashRebate(String moneyRebate){
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}
	
	@Override
	public double acceptCash(double money) {
		return money * this.moneyRebate;
	}

}
