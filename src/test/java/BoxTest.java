import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void texxb() {
        Box<String, Integer, Float> box1 = new Box<>("bmw", 10, 4.5f);
        Box<String, Integer, Float> box2 = new Box<>("audi", 20, 5.5f);
        float res = box1.getType2() + box1.getType3() + box2.getType2() + box2.getType3();
        assertEquals(40, res, 0.01);
    }
}