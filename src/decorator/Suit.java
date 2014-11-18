package decorator;
/**
 * 大話設計模式 Chapter 6 - 裝飾模式 練習
 * @author shuwei
 *
 */

//實現ConcreteDecorator 
class Suit extends Finery {
	@Override
	public void Show(){
		System.out.print("西裝 ");
		super.Show();
	}
}
