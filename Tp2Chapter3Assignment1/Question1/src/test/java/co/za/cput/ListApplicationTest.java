package co.za.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class ListApplicationTest {
    @Test
    public void testListNonNullness() throws Exception {
        ListApplication theList = new ListApplication();
        Assert.assertNotNull(theList);
    }

    @Test
    public void testGetBirthStone() throws Exception {
        ListApplication list = new ListApplication();
        String result = list.getBirthStone(3);
        Assert.assertEquals("Bloodstone, jasper", result);
    }
}
