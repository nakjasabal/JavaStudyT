package test.ex13abstract;

import ex13interface.Game;

abstract class AA{
	public void fn1() {}
	public abstract void fn2();
}
class BB extends AA {	
	public void fn3() {}
	@Override
	public void fn2() {

	}
}
public class Test {
	public static void main(String[] args) {
		//AA a = new AA();
		BB b = new BB();
		int a = Game.SCISSORS;
	}
}
