package com.epam.training.SpringHW.domain;

public class Creep extends Base {

	@Override
	public boolean isCreep() {
		return true;
	}

	public Creep(final String name) {
		super(name);
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Creep [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
