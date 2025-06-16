package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

    SoftAssert softAssert = new SoftAssert();
    String word = "Hello";

    @Test(priority = 0)
    public void valueEqualCheck(){
        String expectedValue = "Hello";
        Assert.assertEquals(word,expectedValue,"values are not similar");
//        if (word.equals("Hello")){
//            System.out.println("Word is equal");
//        }else {
//            System.out.println("Word is not equal");
//        }
    }

    @Test(priority = 1)
    public void conditionCheck() {
        String expectedValue = "World";
        System.out.println("Before soft assert");
        softAssert.assertTrue(expectedValue.contains("Wo"), "Does not contain 'Wo'");
        System.out.println("After soft assert");
        softAssert.assertAll();
    }


}
