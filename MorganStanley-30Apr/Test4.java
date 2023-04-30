package com.java8.lambdas.tests.morganstanley30apr23;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        Integer num = 10;
        num++;
        assert num == null && num >= 0;
        System.out.println(num);

        /////2nd que

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        Integer arr[] = {1,4,3 ,2};
        Arrays.sort(arr, comparator);
        for (Integer a: arr) {
            System.out.println(a);
        }

    }
}
