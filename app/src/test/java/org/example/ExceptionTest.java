package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentNotFoundException extends Exception {
    StudentNotFoundException(String s) {
        super(s);
    }
}

class StudentInfo {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void info() throws StudentNotFoundException {
        if (this.name == null) {
            throw new StudentNotFoundException("student not found");
        }
    }
}

class ExceptionTest {
    @Test
    public void testCheckedExeption() {
        StudentInfo s = new StudentInfo();
        boolean isException = false;
        try {
            s.info();
        } catch (StudentNotFoundException e) {
            isException = true;
        }
        assertEquals(s.getName(), null);
        assertEquals(isException, true);

        isException = false;
        s.setName("Vinh");
        try {
            s.info();
        } catch (Exception e) {
            isException = true;
        }
        assertEquals(isException, false);
    }

    @Test
    public void testUncheckedException() {
        boolean isException = false;
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            isException = true;
        }
        assertEquals(isException, true);

        isException = false;
        int arr[] = new int[5];
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            isException = true;
        }
        assertEquals(isException, true);
    }

    @Test
    public void testTryCatchFinally() {
        boolean isException = false;
        try {
            divide(10, 2);
        } catch (Exception e) {
        } finally {
            isException = true;
        }
        assertEquals(isException, true);
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
