import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void testBox() {
        Box<Integer> box1 = new Box<>(5,10,15);
        Box<Float> box2 = new Box<>(5f,10f,15f);
        assertEquals(0, box1.compare(box2));
    }
}