package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Aninal {
    String eat() {
        return "eating...";
    }
}

class Dog extends Aninal {
    @Override
    String eat() {
        return "dog eating...";
    }

    String bark() {
        return "dog barking...";
    }
}

class BabyDog extends Dog {
    String weep() {
        return "dog weeping...";
    }
}

class InheritanceTest {
    @Test
    public void testAnimal() {
        Aninal a = new Aninal();
        assertEquals(a.eat(), "eating...");

        Aninal d = new Dog();
        assertEquals(d.eat(), "dog eating...");
        // d.bark(); // undefined

        Dog dg = new Dog();
        assertEquals(dg.eat(), "dog eating...");
        assertEquals(dg.bark(), "dog barking...");

        BabyDog bd = new BabyDog();
        assertEquals(bd.eat(), "dog eating...");
        assertEquals(bd.bark(), "dog barking...");
        assertEquals(bd.weep(), "dog weeping...");
    }
}
