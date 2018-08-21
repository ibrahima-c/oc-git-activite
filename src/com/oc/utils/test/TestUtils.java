package com.oc.utils.test;

import java.util.ArrayList;
import java.util.List;

import com.oc.utils.Utils;

public class TestUtils {

    public static void main( String[] args ) {

        List<Double> list = new ArrayList<Double>();

        list.add( 0.0 );
        list.add( 10.0 );
        list.add( 15.0 );
        list.add( -21.0 );

        Double max = Utils.findMax( list );

        System.out.println( max );

    }

}
