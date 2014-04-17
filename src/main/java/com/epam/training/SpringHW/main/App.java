package com.epam.training.SpringHW.main;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.SpringHW.domain.Base;
import com.epam.training.SpringHW.domain.Camp;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(final String[] args) {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		final Camp camp = applicationContext.getBean(Camp.class);

		final List<Base> creeps = camp.getMembers().get("creep");
		final Base player = camp.getMembers().get("player").get(0);

		// while (camp.isAnyoneAlive()) {
		//
		// for (final Base creep : creeps) {
		// creep.attack(player);
		// }
		//
		// for (final Base creep : creeps) {
		// player.attack(creep);
		// }
		//
		// }
	}
}
