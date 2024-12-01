package com.example.demo.drool.controller;

import com.example.demo.drool.dto.Fare;
import com.example.demo.drool.dto.TaxiRide;
import com.example.demo.drool.service.TaxiFareCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FareCalculatorController {
    @Autowired
    TaxiFareCalculatorService taxiFareCalculatorService;

    @PostMapping("/calculate-fare")
    public Fare calculateFare(@RequestBody TaxiRide taxiRide) {
        return taxiFareCalculatorService.calculateFare(taxiRide);
    }
}
