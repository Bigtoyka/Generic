import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("string", 2,3.5f);
        Box<String, Integer, Float> box2 = new Box<>("string", 5,6.5f);
        float result = box1.getValue() + box2.getValue() + box1.getValue2() + box2.getValue2();
        assertEquals(17, result,0.01);
    }
}