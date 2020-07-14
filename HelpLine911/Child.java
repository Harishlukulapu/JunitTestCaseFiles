package com.day6.Assessment;

public class Child {
	public void playWithDog(Item item,Dog tiger) {
		try {
			tiger.play(item);
		}catch(DogExceptions de) {
			de.visit();
		}
	}
}
