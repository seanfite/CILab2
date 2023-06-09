import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    // testing if a string with caps returns true
    @Test
    public void detectCapitalUseTest1()
    {
       myString.setString("Hello");
       assertEquals(true, myString.detectCapitalUse());

    }

    // testing if a string with no caps returns false
    @Test
    public void detectCapitalUseTest2()
    {
        myString.setString("hello");
        assertEquals(false, myString.detectCapitalUse());
    }

    // testing if exception is raised if input is null
    @Test
    public void detectCapitalUseTest3()
    {
        myString.setString("");
        assertThrows(IllegalArgumentException.class, () -> {
            myString.detectCapitalUse();
        });
    }
}
