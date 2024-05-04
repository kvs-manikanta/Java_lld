package com.bms.lambdas;

import java.util.function.BiPredicate;

public class BiPredicateImpl implements BiPredicate<String,String> {

    @Override
    public boolean test(String name1, String name2) {
        if(name1.length()>name2.length())
        {
            return true;
        }
        return false;
    }

}
