package com.epam.training.SpringHW.domain;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Camp {

	private Map<String, List<Base>> members;

	public boolean isAnyoneAlive() {
		boolean anyoneAlive = false;
		for (final Entry<String, List<Base>> entry : members.entrySet()) {
			for (final Base base : entry.getValue()) {
				if (base.getHealth() > 0) {
					anyoneAlive = true;
				}
			}
		}
		return anyoneAlive;
	}

	public Map<String, List<Base>> getMembers() {
		return members;
	}

	public void setMembers(final Map<String, List<Base>> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Camp []");
		return builder.toString();
	}

}
