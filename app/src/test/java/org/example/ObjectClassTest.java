package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Student implements Cloneable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectClassTest {
    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforeAll");
    }

    @Test
    public void testObjectGetClass() {
        assertEquals(true, true);
    }

    @Test
    public void testObjectClone() {
        Student s = new Student("An");
        assertEquals(s.getName(), "An");
        try {
            Student s2 = (Student) s.clone();
            s2.setName("Vinh");
            assertEquals(s.getName(), "An");
            assertEquals(s2.getName(), "Vinh");
        } catch (CloneNotSupportedException e) {

        }
    }
}
