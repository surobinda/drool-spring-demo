package com.example.demo.drool.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TaxiRide {
    private Boolean isNightSurcharge;
    private Long distanceInMile;
}