package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask();
        board.getInProgressList().addTask();
        board.getDoneList().addTask();
        //Then
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getDoneList().getTasks().size());
    }

    @Test
    public void testReadTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask();
        board.getInProgressList().addTask();
        board.getDoneList().addTask();
        //Then
        Assert.assertEquals("task 1", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("task 1", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("task 1", board.getDoneList().getTasks().get(0));
    }
}
