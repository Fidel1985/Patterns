package com.fidel.patterns.behavioral.visitor;

import java.time.Instant;

public class MeasureChargeEvent extends ChargeEvent {
	private int stationId;
	private Instant time;
	private int electricity;

	@Override
	public void accept(ChargeEventListener eventListener) {
		eventListener.handle(this);
	}
}
