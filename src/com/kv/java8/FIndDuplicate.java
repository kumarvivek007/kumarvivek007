package com.kv.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIndDuplicate {
    public static void main(String[] args){
        List<String> carList = Arrays.asList(
                "Maruti",
                "VOlkswagon",
                "Tata",
                "Maruti",
                "Tata",
                "Ford",
                "Tata"
        );
        List<String> distinctCars = carList.stream().distinct().collect(Collectors.toList());
        for(String car :distinctCars){
            carList.remove(car);
        }
        carList.forEach(System.out::println);

    }
}
