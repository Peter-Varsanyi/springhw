package com.epam.training.SpringHW.domain;

public class Skill {

	private String name;
	private double coolDown;
	private double damage;
	private int range;

	public Skill(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public double getCoolDown() {
		return coolDown;
	}

	public void setCoolDown(final double coolDown) {
		this.coolDown = coolDown;
	}

	public int getRange() {
		return range;
	}

	public void setRange(final int range) {
		this.range = range;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(final double damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Skill [name=");
		builder.append(name);
		builder.append(", coolDown=");
		builder.append(coolDown);
		builder.append("]");
		return builder.toString();
	}

}
