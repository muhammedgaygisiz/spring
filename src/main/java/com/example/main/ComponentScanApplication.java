package com.example.main;

import com.example.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// Spring is going to scan this package and down for beans
@SpringBootApplication
@ComponentScan(basePackages = {
		"com.example.services",
		"com.example.controllers",
		"com.example.config"
})
public class ComponentScanApplication {

	public static void main(String[] args) {
		ApplicationContext ctx
				= SpringApplication.run(ComponentScanApplication.class, args);

		I18nController i18nController
				= (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());


		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------ Primary Bean");
		System.out.println(myController.sayHello());


		System.out.println("------ Property");

		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");

		SetterInjectedController setterInjectedController
				= (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");

		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("------ Java Configured Part");

		JavaConfiguredController javaConfiguredController
				= (JavaConfiguredController) ctx.getBean("javaConfiguredController");

		System.out.println(javaConfiguredController.getGreeting());

	}

}
