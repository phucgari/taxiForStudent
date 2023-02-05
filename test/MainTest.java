import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void minNumberTaxis(){
        assertEquals(4,Main.getTaxi(new int[]{1,2,4,3,3}));
        assertEquals(5,Main.getTaxi(new int[]{2,3,4,4,2,1,3,1}));
    }

}