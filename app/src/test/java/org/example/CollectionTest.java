package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

class CollectionTest {
    @Test
    public void testArrayList() {
        List<String> arrayList = new ArrayList<String>();

        assertEquals(arrayList.isEmpty(), true);

        arrayList.add("Java");
        arrayList.add("PHP");

        assertEquals(arrayList.isEmpty(), false);
        // tim kiem phan tu
        assertEquals(arrayList.contains("Java"), true);
        assertEquals(arrayList.contains("C++"), false);

        Iterator<String> itr = arrayList.iterator();
        
        assertEquals(arrayList.size(), 2);
        
        assertEquals(itr.hasNext(), true);
        assertEquals(itr.next(), "Java");

        assertEquals(itr.hasNext(), true);
        assertEquals(itr.next(), "PHP");

        assertEquals(itr.hasNext(), false);

        arrayList.clear();
        assertEquals(arrayList.isEmpty(), true);
    }
}
