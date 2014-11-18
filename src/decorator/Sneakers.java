package decorator;
/**
 * 大話設計模式 Chapter 6 - 裝飾模式 練習
 * @author shuwei
 *
 */

//實現ConcreteDecorator 
class Sneakers extends Finery {
	@Override
	public void Show(){
		System.out.print("破球鞋 ");
		super.Show();
	}
}
