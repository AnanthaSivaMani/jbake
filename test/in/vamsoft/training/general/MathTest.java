package in.vamsoft.training.general;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class MathTest {

    private Math math = null;
    
    
    @BeforeClass
    public static void mathBefore() {
        System.out.println("MathTest.mathBefore()");
    }

    @Before
    public void mathInit() {
        
        math = new Math();

    }

    @Test
    public void testCase1() {
        System.out.println("MathTest.testCase1()");
        int result = math.sum(10, 10);
        int expected = 20;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testCase2() {
        System.out.println("MathTest.testCase2()");
        int result = math.sum(0, 0);
        int expected = 0;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testCase3() {
        System.out.println("MathTest.testCase3()");
        int result = math.sum(-50, -50);
        int expected = -100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCase4() {
        System.out.println("MathTest.testCase4()");
        int result = math.sum(-50, 50);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCase5() {
        System.out.println("MathTest.testCase5()");
        int result = math.sum(-50, 50);
        int expected = 0;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testCase6() {
        System.out.println("MathTest.testCase6()");
        int result = math.sum(-50, 50);
        int expected = 0;
        Assert.assertEquals(expected, result);

    }
    
    @AfterClass
    public static void mathAfter() {
        System.out.println("MathTest.mathAfter()");
    }

}
