package com.epam.training.SpringHW.domain;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Hero extends Base {

	private List<SummonerSkill> summonerSkills;

	@Autowired
	private Item item;

	private static final Logger LOGGER = LoggerFactory.getLogger(Hero.class);

	public List<SummonerSkill> getSummonerSkills() {
		return summonerSkills;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Hero [summonerSkills=");
		builder.append(summonerSkills);
		builder.append(", item=");
		builder.append(item);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	public void setSummonerSkills(final List<SummonerSkill> summonerSkills) {
		this.summonerSkills = summonerSkills;
	}

	public Hero(final String name) {
		super(name);
	}

	@Override
	public boolean isCreep() {
		return false;
	}

	protected void addItem(final Item item) {
		LOGGER.debug("Getting item");
		setHealth(getHealth() + item.getHealth());
		setDamage(getDamage() + item.getDamage());
	}

	public Item getItem() {
		return item;
	}

	public void setItem(final Item item) { // unfortunately @Autowired annotation uses reflection, while xml
											// autowire=byType works
		addItem(item);
		this.item = item;
	}

}
