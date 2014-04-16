package com.epam.training.SpringHW.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Base {

	private static final Logger LOGGER = LoggerFactory.getLogger(Base.class);
	private double health;
	private double damage;
	private String name;

	public Base(final String name) {
		this.name = name;
	}

	public void attack(final Base base) {
		LOGGER.info(this.getName() + " attacking " + base.getName() + " " + base.getHealth());
		base.takeDamage(this.getDamage());
	}

	private void takeDamage(final double damage) {
		health -= damage;
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
