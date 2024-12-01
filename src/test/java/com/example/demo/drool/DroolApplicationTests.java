package com.example.demo.drool;

import com.example.demo.drool.dto.Fare;
import com.example.demo.drool.dto.TaxiRide;
import com.example.demo.drool.service.TaxiFareCalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DroolApplicationTests {

	@Autowired
	private TaxiFareCalculatorService taxiFareCalculatorService;

	@Test
	public void whenNightSurchargeFalseAndDistLessThan10_thenFixWithoutNightSurcharge() {
		TaxiRide taxiRide = new TaxiRide();
		taxiRide.setIsNightSurcharge(true);
		taxiRide.setDistanceInMile(9L);
		Fare rideFare = taxiFareCalculatorService.calculateFare(taxiRide);
		assertNotNull(rideFare);
		assertEquals(Long.valueOf(90), rideFare.getTotalFare());
	}

}
