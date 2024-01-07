package study.daydayup.hello.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test()
public class HelloTestNGTest {

    @BeforeClass
    public void setUp() {
        System.out.println("set up ...");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("tear down ...");
    }

    @Test(groups = {"hello"})
    public void helloGroupTest1() {
        System.out.println("hello group test case 1");
    }

    @Test(groups = {"world"})
    public void worldGroupTest1() {
        System.out.println("world group test case 1");
    }
}
