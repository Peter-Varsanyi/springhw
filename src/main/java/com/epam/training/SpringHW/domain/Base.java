package com.epam.training.SpringHW.domain;

public abstract class Base {

	private double health;
	private double damage;
	private String name;

	public Base(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public double getAutoattackDamage() {
		return damage;
	}

	public abstract boolean isCreep();

	public double getHealth() {
		return health;
	}

	public void setHealth(final double health) {
		this.health = health;
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
		builder.append("Base [health=");
		builder.append(health);
		builder.append(", damage=");
		builder.append(damage);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
