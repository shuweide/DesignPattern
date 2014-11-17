package strategy;
/**
 * 大話設計模式 Chapter2 策略模式 練習
 * @author shuwei
 *
 */
class CashReturn extends CashSuper {
	
	private double moneyCondition = 0.0d; //滿額條件
	private double moneyReturn = 0.0d; //返回紅利金額
	
	public CashReturn(String moneyCondtion, String moneyReturn){
		this.moneyCondition = Double.parseDouble(moneyCondtion);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCondition)
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		return result;
	}

}
