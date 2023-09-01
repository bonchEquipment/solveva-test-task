package com.solveva.solvevatest.service;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    private final HashMap<Integer, String> dividersHashMap = new HashMap<>();

    @PostConstruct
    private void postConstruct(){
        dividersHashMap.put(3, "fizz");
        dividersHashMap.put(5, "buzz");
    }

    public List<String> convertNumbersToWords(List<Integer> integerList){
        List<String> stringList = new ArrayList<>();

        for (var number: integerList)
            stringList.add(convertNumberToWord(number));
        return stringList;
    }


    private String convertNumberToWord(Integer number){
        var stringBuilder = new StringBuilder();
        boolean isDividableAtLeastOnes = false;
        for (var divider: dividersHashMap.keySet())
            if (number % divider == 0){
                stringBuilder.append(dividersHashMap.get(divider));
                isDividableAtLeastOnes = true;
            }

        if (!isDividableAtLeastOnes)
            stringBuilder.append(number);

        return stringBuilder.toString();
    }
}
