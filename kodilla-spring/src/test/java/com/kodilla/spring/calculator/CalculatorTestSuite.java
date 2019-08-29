package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(1,1);
        double sub = calculator.sub(2,1);
        double mul = calculator.mul(2,3);
        double div = calculator.div(8,2);
        //Then
        Assert.assertEquals(2,add,0.0);
        Assert.assertEquals(1,sub,0.0);
        Assert.assertEquals(6,mul,0.0);
        Assert.assertEquals(4,div,0.0);
    }
}
