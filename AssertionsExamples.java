import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExamples {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    @Test
    public void test1() {
        Assert.assertFalse(false);
    }

    @Test
    public void test2() {
        Assert.assertEquals("Test", "Test");
    }

    @Test
    public void test3() {
        Assert.assertEquals("Test", "Test");
    }

    @Test
    public void test4() {
        Assert.assertTrue(true, "matching the expected conditionn");
    }

    @Test
    public void test5() {
        Assert.assertFalse(false, " This is expected condition");
    }

    @Test
    public void test6() {
        Assert.assertNotEquals("test", "test1");
    }
}


