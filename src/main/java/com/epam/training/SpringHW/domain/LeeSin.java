package com.epam.training.SpringHW.domain;

import java.util.List;

public class LeeSin extends Hero {

	private List<Skill> skills;

	public void setSkills(final List<Skill> skills) {
		this.skills = skills;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public LeeSin(final String name) {
		super(name);
	}

	public void addSkill(final Skill skill) {
		skills.add(skill);
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("LeeSin [skills=");
		builder.append(skills);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
