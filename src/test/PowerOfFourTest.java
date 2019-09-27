import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    private PowerOfFour powerOfFour = new PowerOfFour();

    @Test
    public void powerOfFour() {
        int num = 216;
        Boolean result = powerOfFour.powerOfFour(num);
        assertNotNull(result);
        assertEquals(true,result);

    }
}