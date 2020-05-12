package com.example.external_properties;

import com.example.external_properties.examplebeans.FakeDataSource;
import com.example.external_properties.controllers.*;
import com.example.external_properties.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExternalPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx
				= SpringApplication.run(ExternalPropertiesApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUser());
	}

}
