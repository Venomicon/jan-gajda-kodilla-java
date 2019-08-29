package com.kodilla.testing.forum.statistics;

import java.util.*;

import jdk.internal.dynalink.beans.StaticClass;
import org.junit.*;

import static org.mockito.Mockito.*;

public class ForumTestSuite {
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
    public void testPosts0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsMock = 1;
        int commentsMock = 0;
        List<String> usersMock = new ArrayList<String>();
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);

        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        double cpp = calculator.getCommentPerPost();
        int ppu = calculator.getPostPerUser();

        //Then
        Assert.assertEquals(0, cpp, 0.0);
        Assert.assertEquals(0, ppu);
    }

    @Test
    public void testPosts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsMock = 1000;
        int commentsMock = 0;
        List<String> usersMock = new ArrayList<String>();
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);

        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        double cpp = calculator.getCommentPerPost();
        int ppu = calculator.getPostPerUser();

        //Then
        Assert.assertEquals(0, cpp, 0.0);
        Assert.assertEquals(0, ppu);
    }

    @Test
    public void testComments0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsMock = 1;
        int commentsMock = 0;
        List<String> usersMock = new ArrayList<String>();
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);

        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        double cpp = calculator.getCommentPerPost();
        int cpu = calculator.getCommentPerUser();

        //Then
        Assert.assertEquals(0, cpp, 0.0);
        Assert.assertEquals(0, cpu);
    }

    @Test
    public void testMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsMock = 100;
        int commentsMock = 50;
        List<String> usersMock = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            usersMock.add("User " + i);
        }
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);

        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        double cpp = calculator.getCommentPerPost();
        int cpu = calculator.getCommentPerUser();
        int ppu = calculator.getPostPerUser();

        //Then
        Assert.assertEquals(0.5, cpp, 0.01);
        Assert.assertEquals(1, cpu);
        Assert.assertEquals(2, ppu);

    }

    @Test
    public void testMoreComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsMock = 50;
        int commentsMock = 100;
        List<String> usersMock = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            usersMock.add("User " + i);
        }
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);

        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        double cpp = calculator.getCommentPerPost();
        int cpu = calculator.getCommentPerUser();
        double ppu = (double) calculator.getPostPerUser();

        //Then
        Assert.assertEquals(2, cpp, 0.0);
        Assert.assertEquals(2, cpu);
        Assert.assertEquals(1.0, ppu, 0.01);
    }

    @Test
    public void testUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsMock = 50;
        int commentsMock = 50;
        List<String> usersMock = new ArrayList<String>();
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);

        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        double cpp = calculator.getCommentPerPost();
        int cpu = calculator.getCommentPerUser();
        int ppu = calculator.getPostPerUser();

        //Then
        Assert.assertEquals(1, cpp, 0.0);
        Assert.assertEquals(0, cpu);
        Assert.assertEquals(0, ppu);
    }

    @Test
    public void testUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int postsMock = 100;
        int commentsMock = 100;
        List<String> usersMock = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersMock.add("User " + i);
        }
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        when(statisticsMock.usersNames()).thenReturn(usersMock);

        StatisticsCalculator calculator = new StatisticsCalculator(statisticsMock);
        calculator.calculateAdvStatistics(statisticsMock);

        //When
        double cpp = calculator.getCommentPerPost();
        int cpu = calculator.getCommentPerUser();
        int ppu = calculator.getPostPerUser();

        //Then
        Assert.assertEquals(1, cpp, 0.0);
        Assert.assertEquals(1, cpu);
        Assert.assertEquals(1, ppu);
    }
}
