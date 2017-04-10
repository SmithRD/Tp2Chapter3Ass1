package co.za.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class SetApplicationTest {
    @Test
    public void testSetNonNullness() throws Exception {
        SetApplication theSet = new SetApplication();
        Assert.assertNotNull(theSet);
    }

    @Test
    public void testGetNumber() throws Exception {
        SetApplication set = new SetApplication();
        String result = set.getNumber(93);
        Assert.assertEquals("The number is in the list", result);
    }
}
