package com.fidel.patterns.behavioral.visitor;

public class ChargeEventListenerImpl implements ChargeEventListener {

	@Override
	public void handle(StartChargeEvent event) {
		//handle start charge event logic
		System.out.println("Hello from StartChargeEvent");
	}

	@Override
	public void handle(StopChargeEvent event) {
		//handle stop charge event logic
		System.out.println("Hello from StopChargeEvent");
	}

	@Override
	public void handle(MeasureChargeEvent event) {
		//handle measure charge event logic
		System.out.println("Hello from MeasureChargeEvent");
	}
}
