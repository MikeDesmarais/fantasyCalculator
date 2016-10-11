package com.mikedesmarais.fantasycalculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/fantasyCalculator-context.xml");
        Calculator calculator = (Calculator) context.getBean("calculator");
        calculator.run();
        ((AbstractApplicationContext) context).close();
    }
}
