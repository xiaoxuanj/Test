package test;

import java.util.HashMap;
import java.util.Map;

public class richang {
    public static void main(String[] args) {
       Map<String,Object> map = new HashMap<>();
       map.put("a",map.get("a"));
        System.out.println(map.get("a"));
    }
}
