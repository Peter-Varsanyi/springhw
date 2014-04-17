package com.epam.training.SpringHW.domain;


public class Item {

	private double damage;
	private double health;

	public Item() {
		super();
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(final double damage) {
		this.damage = damage;
	}

	public double getHealth() {
		return health;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Item [damage=");
		builder.append(damage);
		builder.append(", health=");
		builder.append(health);
		builder.append("]");
		return builder.toString();
	}

	public void setHealth(final double health) {
		this.health = health;
	}

}
