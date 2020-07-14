package com.day6.Assessment;

public abstract class Item {
	public abstract void action()throws DogExceptions;
}

 class Stone extends Item {
	@Override
	public void action()throws DogExceptions {
		throw new DogBiteException("You beat I bite.....");
	}
}

class Stick extends Item{
	@Override
	public void action() throws DogExceptions{
		throw new DogRunException("you hit I run..................")		;
	}
}
