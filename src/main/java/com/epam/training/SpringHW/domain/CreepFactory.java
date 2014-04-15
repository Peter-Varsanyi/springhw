package com.epam.training.SpringHW.domain;

import org.springframework.beans.factory.FactoryBean;

public class CreepFactory implements FactoryBean<Creep> {

	@Override
	public Creep getObject() throws Exception {
		final Creep creep = new Creep();
		return null;
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
