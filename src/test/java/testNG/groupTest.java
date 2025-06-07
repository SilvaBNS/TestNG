package testNG;

import org.testng.annotations.Test;

public class groupTest {

    @Test(groups = {"S","R"})
    public void test01(){
        System.out.println("This is smoke and Regression test case");
    }

    @Test(groups = {"R"})
    public void test02(){
        System.out.println("This is Regression test case");
    }

    @Test
    public void test03(){
        System.out.println("This is not smoke or Regression test case");
    }

    @Test(groups = "S")
    public void test04(){
        System.out.println("This is smoke test case");
    }

    @Test(groups = {"S","R"})
    public void test05(){
        System.out.println("This is smoke and Regression test case");
    }
}


