package com.msrm.springframework.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		// Report object created without initializing properties
		Report bean1 = ctx.getBean("bean1", Report.class);
		System.out.println(bean1);

		// Report object create and properties initialized by setter methods
		Report bean2 = ctx.getBean("bean2", Report.class);
		System.out.println(bean2);

		// Report object created and value initialized via constructor
		Report bean3 = ctx.getBean("bean3", Report.class);
		System.out.println(bean3);

		ctx.close();
	}

}
