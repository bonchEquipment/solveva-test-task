package com.solveva.solvevatest.controller;

import com.solveva.solvevatest.dto.FizzBuzzRequest;
import com.solveva.solvevatest.dto.FizzBuzzResponse;
import com.solveva.solvevatest.service.FizzBuzzService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FizzBuzzController {

    private final FizzBuzzService service;

    @PostMapping(value = "/fizzBuzz")
    public ResponseEntity<FizzBuzzResponse> updateGeneralStatistics(@RequestBody FizzBuzzRequest request) {
        log.info("fizzBuzz request {}", request);
        var fizzBuzzList = service.convertNumbersToWords(request.getNumbers());
        return createResponse(fizzBuzzList);
    }

    private ResponseEntity<FizzBuzzResponse> createResponse(List<String> list) {
        return new ResponseEntity<>(new FizzBuzzResponse(list), HttpStatus.OK);
    }


}
