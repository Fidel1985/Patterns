package com.fidel.patterns.behavioral.visitor;

public abstract class ChargeEvent {
	public abstract void accept(ChargeEventListener eventListener);
}
