package com.student.helpers;

import java.util.List;

public class Helper {
    public static <T> T searchArray(List<T> listT, T t){
        for(T l : listT){
            if(l == t) return t;
        }
        return null;
    }
}
