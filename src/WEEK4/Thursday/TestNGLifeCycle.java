package WEEK4.Thursday;


import org.testng.annotations.*;

public class TestNGLifeCycle {
    //What is Test NG Life Cycle?

    @BeforeClass   //Runs once before a group of tests
    public void beforeClass(){
        System.out.println("BeforeClass is running!");
    }

    @AfterClass   //Runs once before a group of tests
    public void afterClass(){
        System.out.println("AfterClass is running!");
    }
    @BeforeMethod   // //Runs runs before each method
    public void beforeMethod(){
        System.out.println("BeforeMethod is running!");
    }

    @AfterMethod   //Runs runs after each method
    public void afterMethod(){
        System.out.println("AfterMethod is running!");
    }


    @Test
    public void test1(){
        System.out.println("Test 1 is running!");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running!");
    }
}
