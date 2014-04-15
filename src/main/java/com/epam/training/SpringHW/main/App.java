package com.epam.training.SpringHW.main;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.SpringHW.domain.Base;

public class App {

	public static void main(final String[] args) {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		final Map<String, Base> objects = applicationContext.getBeansOfType(Base.class);
		for (final String objName : objects.keySet()) {
			System.out.println(objName);
		}
	}
}
