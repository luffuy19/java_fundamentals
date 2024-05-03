package com.chainsys.student;

public abstract class MessageAbstract implements Messageinterface{

	@Override
	public void startingMessage() {
		System.out.println("Welcome to Student Application");
		System.out.println("------------------------------");
		System.out.println();
	}	
}

