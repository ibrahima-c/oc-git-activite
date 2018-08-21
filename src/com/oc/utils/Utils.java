package com.oc.utils;

import java.util.List;

public class Utils {

    public static Double findMax( List<Double> list ) {
        Double max;
        if ( list.size() == 0 ) {
            max = null;
        } else {
            max = list.get( 0 );
            for(Double value : list) {
                if(max < value)
                    max = value;
            }
        }

        return max;
    }
}
