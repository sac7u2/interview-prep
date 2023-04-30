package com.java8.lambdas.tests.morganstanley30apr23;

import java.util.HashMap;
import java.util.Map;

public class MorganStanleyTest2 {
    int iVal = 85;
    MorganStanleyTest2() {
        iVal = 41;
    }
    {
        iVal = 27;
    }

    public static void main(String[] args) {
        MorganStanleyTest2 morganStanleyTest2 = new MorganStanleyTest2();
        System.out.println(morganStanleyTest2.iVal);


        Map<Color, Integer> map = new HashMap<>() ;
        map.put(new Color("SS"), 12);
        map.put(new Color("SS1"), 121);
        map.put(new Color("SS2"), 122);
        map.put(new Color("SS3"), 123);

        System.out.println(map.get(new Color("SS")));
    }
}

class Color{
    private String name;
    public Color(String name) {
        this.name = name;
    }
}


