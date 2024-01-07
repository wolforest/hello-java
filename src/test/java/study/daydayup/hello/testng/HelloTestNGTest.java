package study.daydayup.hello.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HelloTestNGTest {

    @BeforeClass
    public void setUp() {
        
    }

    @AfterClass
    public void tearDown() {

    }

    @Test(groups = {"hello"})
    public void helloGroupTest1() {

    }

    @Test(groups = {"world"})
    public void worldGroupTest1() {

    }
}
