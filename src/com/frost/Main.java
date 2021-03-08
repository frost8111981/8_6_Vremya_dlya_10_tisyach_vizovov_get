package com.frost;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        Date start = new Date();
        // напишите тут ваш код

        get10000(list);
        Date end = new Date();
return end.getTime() - start.getTime();
        // напишите тут ваш код

    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
