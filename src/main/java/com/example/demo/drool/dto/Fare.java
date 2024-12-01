package com.example.demo.drool.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Fare {
    private Long nightSurcharge;
    private Long rideFare;
    public Long getTotalFare() {
        return nightSurcharge + rideFare;
    }
}
