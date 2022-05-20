package com.kv.java8;

import java.util.Arrays;
import java.util.List;

public class ToUpperCaseStreams {
    public static void main(String[] args){
        List<String> empList = Arrays.asList("kumar","vivek","sanvi");
        empList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
