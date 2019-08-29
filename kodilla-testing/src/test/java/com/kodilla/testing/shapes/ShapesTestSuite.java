package com.kodilla.testing.shapes;


import com.kodilla.testing.shapes.ShapeCollector;
import org.junit.*;

public class ShapesTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(4.0);

        //When
        collector.addFigure(circle);

        //Then
        Assert.assertEquals(1, collector.getFiguresSize());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(4.0);
        collector.addFigure(circle);

        //When
        collector.removeFigure(circle);

        //Then
        Assert.assertEquals(0, collector.getFiguresSize());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(4.0);

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(4.0);
        collector.addFigure(circle);

        //When
        Shape retrievedShape;
        retrievedShape = collector.getFigure(0);

        //Then
        Assert.assertEquals(circle, retrievedShape);
    }
}
