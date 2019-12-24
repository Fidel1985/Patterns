package com.fidel.patterns.behavioral.visitor;

import java.time.Instant;

public class Station {
	private int id;
	private Instant updated;
	private StationState state;

	enum StationState {CHARGING, WAITING}

	public void setId(int id) {
		this.id = id;
	}

	public void setUpdated(Instant updated) {
		this.updated = updated;
	}

	public void setState(StationState state) {
		this.state = state;
	}
}
