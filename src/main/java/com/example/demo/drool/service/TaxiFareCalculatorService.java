package com.example.demo.drool.service;

import com.example.demo.drool.dto.Fare;
import com.example.demo.drool.dto.TaxiRide;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxiFareCalculatorService {

    @Autowired
    private KieContainer kieContainer;

    public Fare calculateFare(TaxiRide taxiRide) {
        Fare fare = new Fare();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("rideFare", fare);
        kieSession.insert(taxiRide);
        kieSession.fireAllRules();
        kieSession.dispose();
        return fare;
    }
}

