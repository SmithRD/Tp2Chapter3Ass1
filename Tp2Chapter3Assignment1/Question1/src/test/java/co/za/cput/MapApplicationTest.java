package co.za.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class MapApplicationTest {
    @Test
    public void testMapNonNullness() throws Exception {
        MapApplication theMap = new MapApplication();
        Assert.assertNotNull(theMap);
    }

    @Test
    public void testGetBirthStone() throws Exception {
        MapApplication map = new MapApplication();
        String result = map.getStudent("psylock");
        Assert.assertEquals("Elizabeth Braddock", result);
    }
}
