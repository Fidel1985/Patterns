package com.fidel.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ChargeEventContainer extends ChargeEvent {
	private List<ChargeEvent> chargeEvents = new ArrayList<>();

	@Override
	public void accept(ChargeEventListener eventListener) {
		for (ChargeEvent chargeEvent: this.chargeEvents) {
			chargeEvent.accept(eventListener);
		}
	}

	public List<ChargeEvent> getChargeEvents() {
		return chargeEvents;
	}
}
