package com.epam.training.SpringHW.domain;

import java.util.Random;

import org.springframework.beans.factory.FactoryBean;

public class WraithFactory implements FactoryBean<Creep> {

	private double health;

	public double getHealth() {
		return health;
	}

	public void setHealth(final double health) {
		this.health = health;
	}

	private int minDamage, maxDamage;
	private final Random rng;

	public int getMinDamage() {
		return minDamage;
	}

	public void setMinDamage(final int minDamage) {
		this.minDamage = minDamage;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setMaxDamage(final int maxDamage) {
		this.maxDamage = maxDamage;
	}

	@Override
	public Creep getObject() throws Exception {
		final Creep creep = new Creep("Wraith");
		creep.setHealth(health);
		creep.setDamage(rng.nextInt(maxDamage - minDamage) + minDamage);
		return creep;
	}

	public WraithFactory() {
		rng = new Random();
	}

	@Override
	public Class<?> getObjectType() {
		return Creep.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
