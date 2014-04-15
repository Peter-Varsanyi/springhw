package com.epam.training.SpringHW.domain;

import java.util.List;

public class Hero extends Base {

	private List<SummonerSkill> summonerSkills;

	public List<SummonerSkill> getSummonerSkills() {
		return summonerSkills;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Hero [summonerSkills=");
		builder.append(summonerSkills);
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

}
