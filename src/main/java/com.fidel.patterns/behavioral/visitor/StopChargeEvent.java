package com.fidel.patterns.behavioral.visitor;

import java.time.Instant;

public class StopChargeEvent extends ChargeEvent {
	private int stationId;
	private Instant time;
	private Station.StationState state = Station.StationState.WAITING;

	@Override
	public void accept(ChargeEventListener eventListener) {
		eventListener.handle(this);
	}
}
