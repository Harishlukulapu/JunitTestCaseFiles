package com.day6.Assessment;

public class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
	
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
