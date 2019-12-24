package com.fidel.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {
	public static void main(String[] args) {
		// method 1
		List<ChargeEvent> chargeEvents = new ArrayList<>();
		chargeEvents.add(new StartChargeEvent());
		chargeEvents.add(new MeasureChargeEvent());
		chargeEvents.add(new StopChargeEvent());

		ChargeEventListenerImpl eventListener = new ChargeEventListenerImpl();

		for (ChargeEvent chargeEvent: chargeEvents) {
			chargeEvent.accept(eventListener);
		}

		// method 2
		ChargeEventContainer eventContainer = new ChargeEventContainer();
		eventContainer.getChargeEvents().add(new StartChargeEvent());
		eventContainer.getChargeEvents().add(new MeasureChargeEvent());
		eventContainer.getChargeEvents().add(new StopChargeEvent());
		eventContainer.accept(eventListener);
	}
}
