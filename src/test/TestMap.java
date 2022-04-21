package test;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map a = new HashMap();
        for (int i = 0; i < 12; i++) {
            a.put(i, i);
        }

        Map b = new HashMap();
        for (int i = 0; i < 13; i++) {
            b.put(i, i);
        }
        Map c = new HashMap();
        for (int i = 0; i < Math.pow(2,30); i++) {
            c.put(i, i);
        }

        Map d = new HashMap();
        for (int i = 0; i < 1024; i++) {
            d.put(i, i);
        }

        print(a);
        print(b);
        print(c);
        print(d);
    }
    public static void print(Map a) {
        try {
            Class<?> mapType = a.getClass();
            Method capacity = mapType.getDeclaredMethod("capacity");
            capacity.setAccessible(true);
            System.out.println("capacity : " + capacity.invoke(a) + "    size : " + a.size());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
