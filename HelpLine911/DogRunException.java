package com.day6.Assessment;

public class DogRunException extends DogExceptions{
	String msg;
	public DogRunException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg=msg;
	}
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
