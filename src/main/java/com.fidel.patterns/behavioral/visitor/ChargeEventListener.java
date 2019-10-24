package com.fidel.patterns.behavioral.visitor;

public interface ChargeEventListener {

	void handle(StartChargeEvent event);
	void handle(StopChargeEvent event);
	void handle(MeasureChargeEvent event);

}
