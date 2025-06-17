package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    @Test(priority = 0)
    public void testSum(){
        System.out.println("*******First test for sum******");
        System.out.println("-------01st sum-------");
        int actualValue1 = ArithmeticOperator.calSum(20,5);
        System.out.println("Actual Sum 1 is : " + actualValue1);
        Assert.assertEquals(actualValue1, 25, "Failed cal sum 01");

        System.out.println("--------02nd sum-----------");
        int actualValue2 = ArithmeticOperator.calSum(20,10);
        System.out.println("Actual Sum 2 is : " + actualValue2);
        Assert.assertEquals(actualValue2, 30, "Failed cal sum 01");

    }

    @Test(priority = 1)
    public void testSub(){
        System.out.println("*******Second test for sub******");
        System.out.println("-------01st sub-------");
        int actualValueSub1 = ArithmeticOperator.clSub(20,5);
        System.out.println("Actual Sum 1 is : " + actualValueSub1);
        Assert.assertEquals(actualValueSub1, 15, "Failed cal sum 01");

        System.out.println("--------02nd sub-----------");
        int actualValueSub2 = ArithmeticOperator.clSub(20,10);
        System.out.println("Actual Sum 2 is : " + actualValueSub2);
        Assert.assertEquals(actualValueSub2, 10, "Failed cal sum 01");

    }

}
