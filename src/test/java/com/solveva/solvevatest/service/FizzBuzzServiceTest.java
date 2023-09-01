package com.solveva.solvevatest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FizzBuzzServiceTest {

    @Autowired
    private FizzBuzzService service;

    @Test
    void replaceNumbersWithWords(){
        var initialList = List.of(1,2,3,4,5,15,30,41,42);
        var expectedAnswer = List.of("1", "2", "fizz", "4", "buzz", "fizzbuzz",
                "fizzbuzz", "41", "fizz");
        var actualAnswer = service.convertNumbersToWords(initialList);
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void emptyArrayShouldReturnEmptyArray(){
        List<Integer> initialList = new ArrayList<>();
        List<String> expectedAnswer = new ArrayList<>();
        var actualAnswer = service.convertNumbersToWords(initialList);
        assertEquals(expectedAnswer, actualAnswer);
    }

}