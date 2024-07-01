package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class OverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}

class Animal {
}

class Dog extends Animal {

}

public class PolymorphismTest {
    
    @Test
    public void testUpcasting() {
        Animal dog = new Dog();
        assertEquals(dog instanceof Dog, true);
    }

    @Test
    public void testOverloading() {
        OverloadingExample overx = new OverloadingExample();
        int a = 10, b = 10;
        assertEquals(overx.add(a, b), 20);

        float a1 = 0.5f, b1 = 10f;
        assertEquals(overx.add(a1, b1), 10.5);

        int a2 = 1, b2 = 2, c2 = 3;
        assertEquals(OverloadingExample.max(a2, b2), 2);
        assertEquals(OverloadingExample.max(a2, b2, c2), 3);
    }
}
