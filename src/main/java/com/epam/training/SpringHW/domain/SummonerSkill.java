package com.epam.training.SpringHW.domain;

public class SummonerSkill extends Skill {

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("SummonerSkill [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	public SummonerSkill(final String name) {
		super(name);
	}

}
