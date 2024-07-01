package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

abstract class Bike {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract String run();

}

class Honda extends Bike {
    public String run() {
        return "runing";
    }
}

interface Printable {
    void print();
}

interface Showable extends Printable{
    void show();
}

class Print implements Printable{
    @Override
    public void print() {

    }
}

class PrintAnShow implements Showable {
    @Override
    public void print() {
    }

    @Override
    public void show() {
    }
}

public class AbstractionTest {
    @Test
    public void testBike() {
        Honda h = new Honda();
        String name = "Honda";
        h.setName(name);
        assertEquals(h.getName(), name);
        assertEquals(h.run(), "runing");
    }

    @Test
    public void testPrint() {
        Print p = new Print();
        p.print();
        assertEquals(p instanceof Print, true);

        PrintAnShow ps = new PrintAnShow();
        ps.show();
        assertEquals(ps instanceof PrintAnShow, true);
    }
}
